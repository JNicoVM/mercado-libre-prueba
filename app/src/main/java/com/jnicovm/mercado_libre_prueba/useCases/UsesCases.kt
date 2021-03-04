package com.jnicovm.mercado_libre_prueba.useCases

import io.reactivex.Observable
import androidx.lifecycle.LiveData
import com.google.gson.JsonObject
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest
import com.jnicovm.mercado_libre_prueba.repository.SearchRepository

class GetSearchUsesCases (private val searchRespository: SearchRepository){
    fun invoke() : Observable<JsonObject> =
        searchRespository.perfomSearch(SearchRequest(getResource().value?:"", getItem().value?:""))

    fun getResource(): LiveData<String> =
        searchRespository.getResource()

    fun getItem(): LiveData<String> =
        searchRespository.getitem()

    fun setResource(resource: String){
        searchRespository.setResource(resource)
    }

    fun setItem(item: String){
        searchRespository.setitem(item)
    }

    fun buildSearchRequest(resource: String, item: String) = searchRespository.buildSearchRequest(resource = resource, item = item)
}