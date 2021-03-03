package com.jnicovm.mercado_libre_prueba.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;", "", "perfomSearch", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonObject;", "searchRequest", "Lcom/jnicovm/mercado_libre_prueba/models/request/SearchRequest;", "app_debug"})
public abstract interface RemoteSearchDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.google.gson.JsonObject> perfomSearch(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.models.request.SearchRequest searchRequest);
}