package com.jnicovm.mercado_libre_prueba.data

import com.google.gson.JsonObject
import io.reactivex.Observable

import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest

//
interface RemoteSearchDataSource {
    fun perfomSearch(searchRequest: SearchRequest) : Observable<JsonObject>
}