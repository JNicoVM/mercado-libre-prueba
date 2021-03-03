package com.jnicovm.mercado_libre_prueba.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/repository/SearchRepository;", "", "remoteSearchDataSource", "Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;", "searchDao", "Lcom/jnicovm/mercado_libre_prueba/dao/SearchDao;", "(Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;Lcom/jnicovm/mercado_libre_prueba/dao/SearchDao;)V", "buildSearchRequest", "Lcom/jnicovm/mercado_libre_prueba/models/request/SearchRequest;", "resource", "", "item", "getResource", "Landroidx/lifecycle/LiveData;", "getitem", "perfomSearch", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonObject;", "searchRequest", "setResource", "", "setitem", "app_debug"})
public final class SearchRepository {
    private final com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource remoteSearchDataSource = null;
    private final com.jnicovm.mercado_libre_prueba.dao.SearchDao searchDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResource() {
        return null;
    }
    
    public final void setResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getitem() {
        return null;
    }
    
    public final void setitem(@org.jetbrains.annotations.NotNull()
    java.lang.String item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jnicovm.mercado_libre_prueba.models.request.SearchRequest buildSearchRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String resource, @org.jetbrains.annotations.NotNull()
    java.lang.String item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.google.gson.JsonObject> perfomSearch(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.models.request.SearchRequest searchRequest) {
        return null;
    }
    
    public SearchRepository(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource remoteSearchDataSource, @org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.dao.SearchDao searchDao) {
        super();
    }
}