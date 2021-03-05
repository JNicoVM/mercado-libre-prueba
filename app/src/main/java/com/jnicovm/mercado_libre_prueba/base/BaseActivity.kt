package com.jnicovm.mercado_libre_prueba.base

import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.ContentLoadingProgressBar
import com.jnicovm.mercado_libre_prueba.R

open class BaseActivity : AppCompatActivity() {

    private var contentLoadingProgressBar: ContentLoadingProgressBar?=null

    val listaFiltros: Array<String> by lazy {
        resources.getStringArray(R.array.filtro)
    }

    fun mostrarProgressBar() {
        contentLoadingProgressBar?.visibility = View.VISIBLE
        contentLoadingProgressBar?.show()
    }

    fun ocultarProgressBar() {
        contentLoadingProgressBar?.hide()
    }

    fun inicializarProgressBar() {
        contentLoadingProgressBar = findViewById(R.id.contentLoadingProgressBar)
    }

    fun inicializarSpinner(data: Array<String>, spinnerView: Int){
        val adapter = ArrayAdapter(this, R.layout.spinner_selected, data)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown)
        val spinner = findViewById<Spinner>(spinnerView)
        spinner.adapter = adapter
        Log.d("D_spinner_filtro", "inicializado con exito")
    }
}