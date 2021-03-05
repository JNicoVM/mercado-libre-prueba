package com.jnicovm.mercado_libre_prueba.retrofit

import android.util.Log
import com.google.gson.JsonObject
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.MAP_FILTRO
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.MAP_ITEM
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_CATEGORY
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_NICKNAME
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_QUERY
import com.jnicovm.mercado_libre_prueba.retrofit.APIConstants.VAL_SELLER_ID
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.HashMap

//Origen de datos remotos
class SearchRetrofitDataSource(
        private val requestSearch: RequestSearch
) : RemoteSearchDataSource {

    //configuracion RX
    fun configuracionRx(jsonObjectObservable: Observable<JsonObject>): Observable<JsonObject>
            =jsonObjectObservable.subscribeOn(Schedulers.newThread())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .onErrorReturn(this::obtenerError)

    //Configuracion de respuesta de error
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

    // se sobreescribe la funcion de RemoteSearchDataSource para retornar el jsonobject correspondiente
    override fun perfomSearch(searchRequest: SearchRequest): Observable<JsonObject> {
        // Esta logica la cree para que se pudiera llamar a un endpoint con un query diferente
        val map: HashMap<String, String> = HashMap()
        map[MAP_ITEM] = searchRequest.item
        map[MAP_FILTRO] = searchRequest.resource
        Log.d("D_filtro", map[MAP_FILTRO] as String)
        Log.d("D_item", map[MAP_ITEM] as String)
        //Segun el filtro que se escoja se lanzara el servicio que consulte con la palabra clave de cada filtro
        when(map[MAP_FILTRO] as String){
            VAL_QUERY -> return configuracionRx(requestSearch.interfazApi
                .doSearchQuery(map[MAP_ITEM] as String))
            VAL_CATEGORY -> return configuracionRx(requestSearch.interfazApi
                .doSearchCategory(map[MAP_ITEM] as String))
            VAL_NICKNAME -> return configuracionRx(requestSearch.interfazApi
                .doSearchNickName(map[MAP_ITEM] as String))
            VAL_SELLER_ID -> return configuracionRx(requestSearch.interfazApi
                .doSearchSeller(map[MAP_ITEM] as String))
        }
        return configuracionRx(requestSearch.interfazApi
            .doSearchQuery(map[MAP_ITEM] as String))
    }

}