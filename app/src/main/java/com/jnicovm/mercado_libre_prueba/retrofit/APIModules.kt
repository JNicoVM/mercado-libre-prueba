package com.jnicovm.mercado_libre_prueba.retrofit

import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.BASE_API_URL
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class APIModules{

    @Provides
    fun loginRequestProvider(
        @Named("baseUrl") baseUrl: String
    ) = RequestSearch(baseUrl)

    @Provides
    @Singleton
    @Named("baseUrl")
    fun baseUrlProvider(): String = BASE_API_URL

    @Provides
    fun remoteSearchDataSourceProvider(
        requestSearch: RequestSearch
    ): RemoteSearchDataSource = SearchRetrofitDataSource(requestSearch)

}