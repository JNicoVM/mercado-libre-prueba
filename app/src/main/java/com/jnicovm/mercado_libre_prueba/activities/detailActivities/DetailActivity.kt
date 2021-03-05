package com.jnicovm.mercado_libre_prueba.activities.detailActivities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.google.gson.Gson
import com.jnicovm.mercado_libre_prueba.R
import com.jnicovm.mercado_libre_prueba.base.BaseActivity
import com.jnicovm.mercado_libre_prueba.databinding.DetailActivityBinding
import com.jnicovm.mercado_libre_prueba.extensions.APPConstants.INTENT_RESULT
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.squareup.picasso.Picasso
import java.text.DecimalFormat

class DetailActivity: BaseActivity() {

    // Llamado generico de la actividad
    companion object {
        fun startActivity(context: Context, resultResponse: ResultsResponse) {
            val intent = Intent(
                context,
                DetailActivity::class.java
            ).putExtra(INTENT_RESULT, Gson().toJson(resultResponse)) // se envia un intent con la información del item
            context.startActivity(intent)
        }
    }

    // late init del binding
    private lateinit var binding: DetailActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = DetailActivityBinding.inflate(layoutInflater)
        appBarEvents()
        setContentView(binding.root)
        initializeUi()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    //Se inicializa los atributos del appbar y se habilita el back button
    private fun appBarEvents(){
        val actionbar = supportActionBar
        actionbar?.title = resources.getString(R.string.titulo_detalle)
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    @SuppressLint("SetTextI18n")
    private fun initializeUi(){
        // se recibe en la variable local la informacion del item como objeto
       val item = Gson().fromJson(intent.getStringExtra(INTENT_RESULT), ResultsResponse::class.java)

        //Se uso picasso para cargar la imagenes
        Picasso.get()
            .load(item.thumbnail)
            .resize(250,250)
            .into(this.binding.ivItem)

        //Usando el binding se setea toda la informacion del item
        binding.tvCondicion.text = item.condition
        binding.tvVendidos.text = "${DecimalFormat("##.##").format(item.soldQuantity)} vendidos"
        binding.tvNombreItem.text = item.title
        binding.tvPrecioItem.text = "\$ ${DecimalFormat("##.##").format(item.price)}"
        binding.tvDisponibles.text = "${item.availableQuantity} disponibles"
        if(item.shipping.free_shipping)
            binding.tvEnvio.text =  "Envio gratis"
        else
            binding.tvEnvio.visibility = View.GONE
        binding.tvUbicacion.text = item.address.stateName + ", " + item.address.cityName
        binding.tvReputacionVendedor.text = item.seller.sellerReputation.powerSellerStatus
        when(item.seller.sellerReputation.levelId){
            "5_green" -> binding.tvReputacionVendedor.setTextColor(ContextCompat.getColor(this@DetailActivity, R.color.green_54A805))
        }
        if(item.seller.eshop!=null){
            binding.tvVendedor.text = item.seller.eshop.nickName
        } else{
            binding.labelVendedor.visibility = View.GONE
            binding.tvVendedor.visibility = View.GONE
        }

    }
}