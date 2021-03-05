package com.jnicovm.mercado_libre_prueba.activities.searchActivities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import com.jnicovm.mercado_libre_prueba.R
import com.jnicovm.mercado_libre_prueba.activities.detailActivities.DetailActivity
import com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter
import com.jnicovm.mercado_libre_prueba.base.BaseActivity
import com.jnicovm.mercado_libre_prueba.databinding.SearchActivityBinding
import com.jnicovm.mercado_libre_prueba.di.SearchComponent
import com.jnicovm.mercado_libre_prueba.di.SearchModule
import com.jnicovm.mercado_libre_prueba.extensions.app
import com.jnicovm.mercado_libre_prueba.extensions.getViewModel
import com.jnicovm.mercado_libre_prueba.extensions.hideKeyboard
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.jnicovm.mercado_libre_prueba.models.response.SearchResponse
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_CATEGORY
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_NICKNAME
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_QUERY
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_SELLER_ID

class SearchActivity : BaseActivity()  {

    // Llamado generico de la actividad
    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(
                context,
                SearchActivity::class.java
            )
            context.startActivity(intent)
        }
    }

    // Componente para la inyeccion del viewmodel
    private lateinit var searchComponent: SearchComponent

    // adapatador del recyclerView
    private var itemsAdapter= ItemsAdapter()

    // inicializacion del recyclerview
    private val searchViewmodel: SearchViewmodel by lazy {
        //construyendo viewmodelprovider con funcion generica
        getViewModel { searchComponent.searchViewModel }
    }

    // late init del binding
    private lateinit var binding: SearchActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = SearchActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        initializeUi()
        initListeners()
    }

    //Se carga toda la data que se va a usar en la actividad
    private fun loadData(){
        // se inyecta el viewmodel de "SearchModule"
        searchComponent = app.component.inject(SearchModule())
        // como valor default se have una consulta por "q" segun la documentación de las Apis
        searchViewmodel.setResource(VAL_QUERY)
    }

    // Se inicializan los elemento de usuario que va a estar trabajando a lo largo de la vida de la actividad
    private fun initializeUi(){
        // Se iniciliza el progressbar indeterminado segun su R.id
        inicializarProgressBar()
        // Se iniciliza el spinner segun su lista de parametros y R.id
        inicializarSpinner(listaFiltros, R.id.spinnerFiltro)
        // Se asigna el correspondiente layoutManager al recyclerview y el respectivo adapter
        binding.rvItems.apply {
            layoutManager = LinearLayoutManager(this@SearchActivity, LinearLayoutManager.VERTICAL, false)
            adapter = itemsAdapter
        }
    }

    // Se inicializan los diferentes tipos de listeners que va a estar trabajando a lo largo de la vida de la actividad
    private fun initListeners(){
        //El escuchador de la variable searchValues declarada como livedata
        searchViewmodel.searchValues.observe(this, {
            ocultarProgressBar()
            //Se carga la lista de elementos en el adaptador
            loadAdapter(it)
        })

        // Listener del boton buscar
        binding.btnBuscar.setOnClickListener {
            searchViewmodel.setItem(binding.etSearch.text.toString())
            //Se llama al servicio de hacer busqueda
            searchViewmodel.perfomSearch()
            mostrarProgressBar()
            currentFocus?.hideKeyboard()
        }
        //Listener del boton del teclado "ENTER"
        binding.etSearch.setOnKeyListener(View.OnKeyListener {_, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                searchViewmodel.setItem(binding.etSearch.text.toString())
                //Se llama al servicio de hacer busqueda
                searchViewmodel.perfomSearch()
                mostrarProgressBar()
                currentFocus?.hideKeyboard()
                return@OnKeyListener true
            }
            false
        })

        // Se asigna al callback asignado la funcion infoItem
        itemsAdapter.onUserClicked(this::infoItem)

        // Listener de la posicion del spinner
        binding.spinnerFiltro.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                // segun la posicion del spinner se va a hacer un query con un filtro diferente
                when(position){
                    0 -> searchViewmodel.setResource(VAL_QUERY)
                    1 -> searchViewmodel.setResource(VAL_CATEGORY)
                    2 -> searchViewmodel.setResource(VAL_NICKNAME)
                    3 -> searchViewmodel.setResource(VAL_SELLER_ID)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }

    //Se carga la lista que llega del servicio en el adaptador
    private fun loadAdapter(searchResponse: SearchResponse) {
        searchResponse.results.let {
            itemsAdapter.updateItem(it)
            if(it.isEmpty())
                binding.noData.visibility = View.VISIBLE
            else
                binding.noData.visibility = View.GONE
        }
    }

    //Funcion asignada al callback del click de cada elemento de la lista
    private fun infoItem(result: ResultsResponse){
        DetailActivity.startActivity(this, result)
    }

}