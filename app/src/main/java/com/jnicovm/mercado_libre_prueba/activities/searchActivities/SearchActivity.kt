package com.jnicovm.mercado_libre_prueba.activities.searchActivities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jnicovm.mercado_libre_prueba.activities.detailActivities.DetailActivity
import com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter
import com.jnicovm.mercado_libre_prueba.databinding.SearchActivityBinding
import com.jnicovm.mercado_libre_prueba.di.SearchComponent
import com.jnicovm.mercado_libre_prueba.di.SearchModule
import com.jnicovm.mercado_libre_prueba.extensions.app
import com.jnicovm.mercado_libre_prueba.extensions.getViewModel
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.jnicovm.mercado_libre_prueba.models.response.SearchResponse

class SearchActivity : AppCompatActivity()  {

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(
                context,
                SearchActivity::class.java
            )
            context.startActivity(intent)
        }
    }

    private lateinit var searchComponent: SearchComponent
    private var itemsAdapter= ItemsAdapter()
    private val searchViewmodel: SearchViewmodel by lazy {
        getViewModel { searchComponent.searchViewModel }
    }

    //Binding
    private lateinit var binding: SearchActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = SearchActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeUi()
        loadData()
        initListeners()
    }

    private fun loadData(){
        searchComponent = app.component.inject(SearchModule())
        searchViewmodel.setResource("q")
        searchViewmodel.searchValues.observe(this, Observer {
            loadAdapter(it)
        })
    }

    private fun initializeUi(){
        binding.rvItems.apply {
            layoutManager = LinearLayoutManager(this@SearchActivity, LinearLayoutManager.VERTICAL, false)
            adapter = itemsAdapter
        }
    }

    private fun loadAdapter(searchResponse: SearchResponse) {
        searchResponse.results.let {
            itemsAdapter.updateItem(it)
            if(it.isEmpty())
                binding.noData.visibility = View.VISIBLE
            else
                binding.noData.visibility = View.GONE
        }
    }

    private fun initListeners(){
        binding.btnBuscar.setOnClickListener {
            searchViewmodel.setItem(binding.etSearch.text.toString())
            searchViewmodel.perfomSearch()
        }
        binding.etSearch.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                searchViewmodel.setItem(binding.etSearch.text.toString())
                searchViewmodel.perfomSearch()
                return@OnKeyListener true
            }
            false
        })

        itemsAdapter.onUserClicked(this::infoItem)
    }

    private fun infoItem(result: ResultsResponse){
        DetailActivity.startActivity(this, result)
    }

}