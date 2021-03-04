package com.jnicovm.mercado_libre_prueba.retrofit

import android.util.Log
import com.google.gson.JsonObject
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.HashMap

class SearchRetrofitDataSource(
        private val requestSearch: RequestSearch
) : RemoteSearchDataSource {

    fun configuracionRx(jsonObjectObservable: Observable<JsonObject>): Observable<JsonObject>
            =jsonObjectObservable.subscribeOn(Schedulers.newThread())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .onErrorReturn(this::obtenerError)

    private fun obtenerError(throwable: Throwable): JsonObject {
        val error="${throwable.message} Class: ${throwable.javaClass.name}"
        Log.e("Api Error",error,throwable)
        val jsonObject=JsonObject()
        val mensajeError= when(throwable) {
            is SocketTimeoutException ->
                Log.e("Time out", "No internet connection")
            is UnknownHostException ->
                Log.e("Time out", "No internet connection")
            else ->
                Log.e("unx error", "Might be an error")
        }
        jsonObject.addProperty("response",mensajeError)
        return jsonObject
    }

    override fun perfomSearch(searchRequest: SearchRequest): Observable<JsonObject> {
        val map: HashMap<String, String> = HashMap()
        map[searchRequest.resource] = searchRequest.item
        return configuracionRx(requestSearch.interfazApi
                .doSearch(map["q"] as String))

    }

}