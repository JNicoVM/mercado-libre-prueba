package com.jnicovm.mercado_libre_prueba.models.request

import com.google.gson.annotations.SerializedName

data class SearchRequest(
    val resource : String,
    val item : String
)