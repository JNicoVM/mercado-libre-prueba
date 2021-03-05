package com.jnicovm.mercado_libre_prueba.activities.detailActivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0003J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/activities/detailActivities/DetailActivity;", "Lcom/jnicovm/mercado_libre_prueba/base/BaseActivity;", "()V", "binding", "Lcom/jnicovm/mercado_libre_prueba/databinding/DetailActivityBinding;", "appBarEvents", "", "initializeUi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "Companion", "app_debug"})
public final class DetailActivity extends com.jnicovm.mercado_libre_prueba.base.BaseActivity {
    private com.jnicovm.mercado_libre_prueba.databinding.DetailActivityBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.jnicovm.mercado_libre_prueba.activities.detailActivities.DetailActivity.Companion Companion = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void appBarEvents() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initializeUi() {
    }
    
    public DetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/activities/detailActivities/DetailActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "resultResponse", "Lcom/jnicovm/mercado_libre_prueba/models/response/ResultsResponse;", "app_debug"})
    public static final class Companion {
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse resultResponse) {
        }
        
        private Companion() {
            super();
        }
    }
}