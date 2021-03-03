package com.jnicovm.mercado_libre_prueba.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/retrofit/SearchRetrofitDataSource;", "Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;", "requestSearch", "Lcom/jnicovm/mercado_libre_prueba/retrofit/RequestSearch;", "(Lcom/jnicovm/mercado_libre_prueba/retrofit/RequestSearch;)V", "configuracionRx", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonObject;", "jsonObjectObservable", "obtenerError", "throwable", "", "perfomSearch", "searchRequest", "Lcom/jnicovm/mercado_libre_prueba/models/request/SearchRequest;", "app_debug"})
public final class SearchRetrofitDataSource implements com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource {
    private final com.jnicovm.mercado_libre_prueba.retrofit.RequestSearch requestSearch = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.google.gson.JsonObject> configuracionRx(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.google.gson.JsonObject> jsonObjectObservable) {
        return null;
    }
    
    private final com.google.gson.JsonObject obtenerError(java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.google.gson.JsonObject> perfomSearch(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.models.request.SearchRequest searchRequest) {
        return null;
    }
    
    public SearchRetrofitDataSource(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.retrofit.RequestSearch requestSearch) {
        super();
    }
}