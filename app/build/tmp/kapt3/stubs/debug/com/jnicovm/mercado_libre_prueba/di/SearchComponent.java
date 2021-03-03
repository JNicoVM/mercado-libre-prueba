package com.jnicovm.mercado_libre_prueba.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/di/SearchComponent;", "", "searchViewModel", "Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchViewmodel;", "getSearchViewModel", "()Lcom/jnicovm/mercado_libre_prueba/activities/searchActivities/SearchViewmodel;", "app_debug"})
@dagger.Subcomponent(modules = {com.jnicovm.mercado_libre_prueba.di.SearchModule.class})
public abstract interface SearchComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jnicovm.mercado_libre_prueba.activities.searchActivities.SearchViewmodel getSearchViewModel();
}