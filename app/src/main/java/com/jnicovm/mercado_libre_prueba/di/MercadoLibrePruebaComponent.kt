package com.jnicovm.mercado_libre_prueba.di

import android.app.Application
import com.jnicovm.mercado_libre_prueba.dao.SearchDaoModule
import com.jnicovm.mercado_libre_prueba.repository.RepositoryModule
import com.jnicovm.mercado_libre_prueba.retrofit.APIModules
import com.jnicovm.mercado_libre_prueba.useCases.UseCaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    APIModules::class,
    RepositoryModule::class,
    SearchDaoModule::class,
    UseCaseModule::class
])
interface MercadoLibrePruebaComponent {

    fun inject(module: SearchModule): SearchComponent

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): MercadoLibrePruebaComponent
    }
}