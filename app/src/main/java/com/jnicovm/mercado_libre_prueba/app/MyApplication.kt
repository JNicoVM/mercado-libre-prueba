package com.jnicovm.mercado_libre_prueba.app

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.jnicovm.mercado_libre_prueba.di.DaggerMercadoLibrePruebaComponent
import com.jnicovm.mercado_libre_prueba.di.MercadoLibrePruebaComponent

class MyApplication: Application() {

    lateinit var component : MercadoLibrePruebaComponent
        private set

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        component = initAppComponent()
    }

    private fun initAppComponent() = DaggerMercadoLibrePruebaComponent.factory().create(this)
}