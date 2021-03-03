package com.jnicovm.mercado_libre_prueba.retrofit

import android.content.Context
import android.util.Log
import com.google.gson.JsonObject
import com.readystatesoftware.chuck.ChuckInterceptor
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit

abstract class BaseRequest<T: Any>(
    baseUrl: String
) {

    private val interceptor= HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val cliente=OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(40,TimeUnit.SECONDS)
            .build()

    val interfazApi: MercadoLibrePruebaService= Retrofit.Builder()
            .client(cliente)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
            .create(MercadoLibrePruebaService::class.java)
}

class RequestSearch(baseUrl: String): BaseRequest<MercadoLibrePruebaService>(baseUrl)

