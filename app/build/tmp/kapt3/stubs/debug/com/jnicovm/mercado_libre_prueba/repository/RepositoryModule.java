package com.jnicovm.mercado_libre_prueba.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/repository/RepositoryModule;", "", "()V", "searchRepositoryProvider", "Lcom/jnicovm/mercado_libre_prueba/repository/SearchRepository;", "remoteSearchDataSource", "Lcom/jnicovm/mercado_libre_prueba/data/RemoteSearchDataSource;", "searchDao", "Lcom/jnicovm/mercado_libre_prueba/dao/SearchDao;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.jnicovm.mercado_libre_prueba.repository.SearchRepository searchRepositoryProvider(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource remoteSearchDataSource, @org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.dao.SearchDao searchDao) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}