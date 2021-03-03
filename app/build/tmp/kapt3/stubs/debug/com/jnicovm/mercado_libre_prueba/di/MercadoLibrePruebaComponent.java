package com.jnicovm.mercado_libre_prueba.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/di/MercadoLibrePruebaComponent;", "", "inject", "Lcom/jnicovm/mercado_libre_prueba/di/SearchComponent;", "module", "Lcom/jnicovm/mercado_libre_prueba/di/SearchModule;", "Factory", "app_debug"})
@dagger.Component(modules = {com.jnicovm.mercado_libre_prueba.retrofit.APIModules.class, com.jnicovm.mercado_libre_prueba.repository.RepositoryModule.class, com.jnicovm.mercado_libre_prueba.dao.SearchDaoModule.class, com.jnicovm.mercado_libre_prueba.useCases.UseCaseModule.class})
@javax.inject.Singleton()
public abstract interface MercadoLibrePruebaComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jnicovm.mercado_libre_prueba.di.SearchComponent inject(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.di.SearchModule module);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/di/MercadoLibrePruebaComponent$Factory;", "", "create", "Lcom/jnicovm/mercado_libre_prueba/di/MercadoLibrePruebaComponent;", "app", "Landroid/app/Application;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.jnicovm.mercado_libre_prueba.di.MercadoLibrePruebaComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.app.Application app);
    }
}