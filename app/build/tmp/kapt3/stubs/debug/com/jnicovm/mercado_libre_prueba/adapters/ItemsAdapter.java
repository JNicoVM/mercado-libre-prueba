package com.jnicovm.mercado_libre_prueba.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0003J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J$\u0010\u001e\u001a\u00020\u00072\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bJ\u001e\u0010\u001f\u001a\u00020\u00072\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00060!j\b\u0012\u0004\u0012\u00020\u0006`\"R$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/adapters/ItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/jnicovm/mercado_libre_prueba/adapters/ItemsAdapter$ItemsViewHolder;", "()V", "callbackClickItem", "Lkotlin/Function1;", "Lcom/jnicovm/mercado_libre_prueba/models/response/ResultsResponse;", "", "Lcom/jnicovm/mercado_libre_prueba/extensions/CallbackT;", "itemsList", "", "checkFreeShipping", "", "holder", "freeShipping", "", "checkInstallments", "installments", "Lcom/jnicovm/mercado_libre_prueba/models/response/InstallmentsResponse;", "getItemCount", "", "initListeners", "item", "initUi", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUserClicked", "updateItem", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ItemsViewHolder", "app_debug"})
public final class ItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder> {
    private java.util.List<com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse> itemsList;
    private kotlin.jvm.functions.Function1<? super com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse, kotlin.Unit> callbackClickItem;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateItem(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse> items) {
    }
    
    public final void onUserClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse, kotlin.Unit> callbackClickItem) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initUi(com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder holder, com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse item) {
    }
    
    private final void initListeners(com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder holder, com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse item) {
    }
    
    private final java.lang.String checkInstallments(com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder holder, com.jnicovm.mercado_libre_prueba.models.response.InstallmentsResponse installments) {
        return null;
    }
    
    private final java.lang.String checkFreeShipping(com.jnicovm.mercado_libre_prueba.adapters.ItemsAdapter.ItemsViewHolder holder, boolean freeShipping) {
        return null;
    }
    
    public ItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jnicovm/mercado_libre_prueba/adapters/ItemsAdapter$ItemsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Lcom/jnicovm/mercado_libre_prueba/databinding/HolderItemBinding;", "getBinding", "()Lcom/jnicovm/mercado_libre_prueba/databinding/HolderItemBinding;", "setBinding", "(Lcom/jnicovm/mercado_libre_prueba/databinding/HolderItemBinding;)V", "app_debug"})
    public static final class ItemsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.jnicovm.mercado_libre_prueba.databinding.HolderItemBinding binding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jnicovm.mercado_libre_prueba.databinding.HolderItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.jnicovm.mercado_libre_prueba.databinding.HolderItemBinding p0) {
        }
        
        public ItemsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}