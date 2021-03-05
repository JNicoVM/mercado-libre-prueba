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
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.squareup.picasso.Picasso
import java.text.DecimalFormat

class DetailActivity: BaseActivity() {

    companion object {
        fun startActivity(context: Context, resultResponse: ResultsResponse) {
            val intent = Intent(
                context,
                DetailActivity::class.java
            ).putExtra("result", Gson().toJson(resultResponse))
            context.startActivity(intent)
        }
    }

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

    private fun appBarEvents(){
        val actionbar = supportActionBar
        actionbar?.title = "Detalle"
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    @SuppressLint("SetTextI18n")
    private fun initializeUi(){
       val item = Gson().fromJson(intent.getStringExtra("result"), ResultsResponse::class.java)
        Picasso.get()
            .load(item.thumbnail)
            .resize(250,250)
            .into(this.binding.ivItem)
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