package com.jnicovm.mercado_libre_prueba.di

import com.jnicovm.mercado_libre_prueba.activities.searchActivities.SearchViewmodel
import com.jnicovm.mercado_libre_prueba.useCases.GetSearchUsesCases
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Module
class SearchModule {

    @Provides
    fun loginViewModelProvider(
        loginUseCase: GetSearchUsesCases
    ) = SearchViewmodel(loginUseCase)
}

@Subcomponent(modules = [(SearchModule::class)])
interface SearchComponent{
    val searchViewModel: SearchViewmodel
}