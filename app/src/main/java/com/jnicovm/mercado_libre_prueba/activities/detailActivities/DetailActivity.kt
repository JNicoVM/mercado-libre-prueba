package com.jnicovm.mercado_libre_prueba.activities.detailActivities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.gson.Gson
import com.jnicovm.mercado_libre_prueba.databinding.DetailActivityBinding
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.squareup.picasso.Picasso

class DetailActivity: AppCompatActivity() {

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
        appBarEvents()
        binding = DetailActivityBinding.inflate(layoutInflater)
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

    private fun initializeUi(){
       val item = Gson().fromJson(intent.getStringExtra("result"), ResultsResponse::class.java)
        Picasso.get()
            .load(item.thumbnail)
            .resize(250, 250)
            .into(this.binding.ivItem)
        binding.nombreItem.text = item.title
        binding.precioItem.text = item.price.toString()
    }
}