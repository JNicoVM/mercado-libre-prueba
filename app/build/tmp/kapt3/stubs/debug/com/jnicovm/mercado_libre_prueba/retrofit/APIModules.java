package com.jnicovm.mercado_libre_prueba.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/retrofit/APIModules;", "", "()V", "baseUrlProvider", "", "loginRequestProvider", "Lcom/jnicovm/mercado_libre_prueba/retrofit/RequestSearch;", "baseUrl", "remoteSearchDataSourceProvider", "Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;", "requestSearch", "app_debug"})
@dagger.Module()
public final class APIModules {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.jnicovm.mercado_libre_prueba.retrofit.RequestSearch loginRequestProvider(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String baseUrlProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource remoteSearchDataSourceProvider(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.retrofit.RequestSearch requestSearch) {
        return null;
    }
    
    public APIModules() {
        super();
    }
}