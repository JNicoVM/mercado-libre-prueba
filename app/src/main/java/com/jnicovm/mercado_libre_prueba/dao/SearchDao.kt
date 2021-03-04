package com.jnicovm.mercado_libre_prueba.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest

class SearchDao {
    private var resource = MutableLiveData<String>()
    private var item = MutableLiveData<String>()


    fun getResource() = resource as LiveData<String>

    fun getItem() = item as LiveData<String>

    fun setResource(resource: String){
        this.resource.value = resource
    }

    fun setItem(item: String){
        this.item.value = item
    }

    fun buildSearchRequest(resource: String, item: String) = SearchRequest(resource = resource, item = item)
}