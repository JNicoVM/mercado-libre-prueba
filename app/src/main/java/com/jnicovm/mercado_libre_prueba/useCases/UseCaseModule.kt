package com.jnicovm.mercado_libre_prueba.useCases


import com.jnicovm.mercado_libre_prueba.repository.SearchRepository
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun perfomSearch(searchRepository: SearchRepository) =
        GetSearchUsesCases(searchRepository)
}
