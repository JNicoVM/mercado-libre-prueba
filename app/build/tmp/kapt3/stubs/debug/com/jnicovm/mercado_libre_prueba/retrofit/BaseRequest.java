package com.jnicovm.mercado_libre_prueba.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/retrofit/BaseRequest;", "T", "", "baseUrl", "", "(Ljava/lang/String;)V", "cliente", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "interfazApi", "Lcom/jnicovm/mercado_libre_prueba/retrofit/MercadoLibrePruebaService;", "getInterfazApi", "()Lcom/jnicovm/mercado_libre_prueba/retrofit/MercadoLibrePruebaService;", "app_debug"})
public abstract class BaseRequest<T extends java.lang.Object> {
    private final okhttp3.logging.HttpLoggingInterceptor interceptor = null;
    private final okhttp3.OkHttpClient cliente = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jnicovm.mercado_libre_prueba.retrofit.MercadoLibrePruebaService interfazApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jnicovm.mercado_libre_prueba.retrofit.MercadoLibrePruebaService getInterfazApi() {
        return null;
    }
    
    public BaseRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        super();
    }
}