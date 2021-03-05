package com.jnicovm.mercado_libre_prueba.activities.searchActivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchActivity;", "Lcom/jnicovm/mercado_libre_prueba/base/BaseActivity;", "()V", "binding", "Lcom/jnicovm/mercado_libre_prueba/databinding/SearchActivityBinding;", "itemsAdapter", "Lcom/jnicovm/mercado_libre_prueba/adapters/ItemsAdapter;", "searchComponent", "Lcom/jnicovm/mercado_libre_prueba/di/SearchComponent;", "searchViewmodel", "Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchViewmodel;", "getSearchViewmodel", "()Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchViewmodel;", "searchViewmodel$delegate", "Lkotlin/Lazy;", "infoItem", "", "result", "Lcom/jnicovm/mercado_libre_prueba/models/response/ResultsResponse;", "initListeners", "initializeUi", "loadAdapter", "searchResponse", "Lcom/jnicovm/mercado_libre_prueba/models/response/SearchResponse;", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class SearchActivity extends com.jnicovm.mercado_libre_prueba.base.BaseActivity {
    private com.jnicovm.mercado_libre_prueba.di.SearchComponent searchComponent;
    private com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter itemsAdapter;
    private final kotlin.Lazy searchViewmodel$delegate = null;
    private com.jnicovm.mercado_libre_prueba.databinding.SearchActivityBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.jnicovm.mercado_libre_prueba.activities.searchActivities.SearchActivity.Companion Companion = null;
    
    private final com.jnicovm.mercado_libre_prueba.activities.searchActivities.SearchViewmodel getSearchViewmodel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData() {
    }
    
    private final void initializeUi() {
    }
    
    private final void loadAdapter(com.jnicovm.mercado_libre_prueba.models.response.SearchResponse searchResponse) {
    }
    
    private final void initListeners() {
    }
    
    private final void infoItem(com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse result) {
    }
    
    public SearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}