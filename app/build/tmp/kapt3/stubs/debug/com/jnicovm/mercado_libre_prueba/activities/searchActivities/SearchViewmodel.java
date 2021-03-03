package com.jnicovm.mercado_libre_prueba.activities.searchActivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchViewmodel;", "Landroidx/lifecycle/ViewModel;", "getSearchUsesCases", "Lcom/jnicovm/mercado_libre_prueba/useCases/GetSearchUsesCases;", "(Lcom/jnicovm/mercado_libre_prueba/useCases/GetSearchUsesCases;)V", "_searchValues", "Landroidx/lifecycle/MutableLiveData;", "Lcom/jnicovm/mercado_libre_prueba/models/response/SearchResponse;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "searchValues", "Landroidx/lifecycle/LiveData;", "getSearchValues", "()Landroidx/lifecycle/LiveData;", "buildSearchRequest", "Lcom/jnicovm/mercado_libre_prueba/models/request/SearchRequest;", "resource", "", "item", "getItem", "getResource", "perfomSearch", "", "setItem", "setResource", "app_debug"})
public final class SearchViewmodel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<com.jnicovm.mercado_libre_prueba.models.response.SearchResponse> _searchValues = null;
    private final com.jnicovm.mercado_libre_prueba.useCases.GetSearchUsesCases getSearchUsesCases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResource() {
        return null;
    }
    
    public final void setResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    java.lang.String item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jnicovm.mercado_libre_prueba.models.request.SearchRequest buildSearchRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String resource, @org.jetbrains.annotations.NotNull()
    java.lang.String item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jnicovm.mercado_libre_prueba.models.response.SearchResponse> getSearchValues() {
        return null;
    }
    
    public final void perfomSearch() {
    }
    
    public SearchViewmodel(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.useCases.GetSearchUsesCases getSearchUsesCases) {
        super();
    }
}