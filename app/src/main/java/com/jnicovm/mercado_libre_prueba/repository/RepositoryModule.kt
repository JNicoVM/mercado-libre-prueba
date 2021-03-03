package com.jnicovm.mercado_libre_prueba.repository

import com.jnicovm.mercado_libre_prueba.dao.SearchDao
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun searchRepositoryProvider(
        remoteSearchDataSource: RemoteSearchDataSource,
        searchDao: SearchDao
    ) = SearchRepository(
        remoteSearchDataSource,
        searchDao
    )
}