package com.jnicovm.mercado_libre_prueba.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/retrofit/MercadoLibrePruebaService;", "", "doSearchCategory", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonObject;", "item", "", "doSearchNickName", "doSearchQuery", "doSearchSeller", "app_debug"})
public abstract interface MercadoLibrePruebaService {
    
    /**
     * APIS SEARCH
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/")
    @retrofit2.http.Headers(value = {"Authorization: Bearer"})
    public abstract io.reactivex.Observable<com.google.gson.JsonObject> doSearchQuery(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String item);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/")
    @retrofit2.http.Headers(value = {"Authorization: Bearer"})
    public abstract io.reactivex.Observable<com.google.gson.JsonObject> doSearchCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String item);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/")
    @retrofit2.http.Headers(value = {"Authorization: Bearer"})
    public abstract io.reactivex.Observable<com.google.gson.JsonObject> doSearchNickName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nickname")
    java.lang.String item);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/")
    @retrofit2.http.Headers(value = {"Authorization: Bearer"})
    public abstract io.reactivex.Observable<com.google.gson.JsonObject> doSearchSeller(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "seller_id")
    java.lang.String item);
}