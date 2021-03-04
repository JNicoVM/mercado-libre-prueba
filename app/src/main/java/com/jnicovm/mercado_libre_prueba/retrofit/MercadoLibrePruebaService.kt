package com.jnicovm.mercado_libre_prueba.retrofit


import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface MercadoLibrePruebaService
{
    @Headers(
        "Authorization: Bearer"
    )
    /** API SEARCH*/
    @GET(APIConstants.KEY_SEARCH)
    fun doSearch(@Query("q") item:String) : Observable<JsonObject>

}