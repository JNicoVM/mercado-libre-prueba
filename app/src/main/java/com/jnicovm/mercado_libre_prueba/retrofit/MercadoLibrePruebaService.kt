package com.jnicovm.mercado_libre_prueba.retrofit


import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface MercadoLibrePruebaService
{
    /** APIS SEARCH*/
    @Headers(
        "Authorization: Bearer"
    )
    @GET(APIConstants.KEY_SEARCH)
    fun doSearchQuery(@Query("q") item:String) : Observable<JsonObject>

    @Headers(
        "Authorization: Bearer"
    )
    @GET(APIConstants.KEY_SEARCH)
    fun doSearchCategory(@Query("category") item:String) : Observable<JsonObject>

    @Headers(
        "Authorization: Bearer"
    )
    @GET(APIConstants.KEY_SEARCH)
    fun doSearchNickName(@Query("nickname") item:String) : Observable<JsonObject>

    @Headers(
        "Authorization: Bearer"
    )
    @GET(APIConstants.KEY_SEARCH)
    fun doSearchSeller(@Query("seller_id") item:String) : Observable<JsonObject>



}