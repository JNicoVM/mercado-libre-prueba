package com.jnicovm.mercado_libre_prueba.dao

import dagger.Module
import dagger.Provides

@Module
class SearchDaoModule {

    @Provides
    fun searchDaoProvider() = SearchDao()
}