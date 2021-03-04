package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class InstallmentsResponse(
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("rate")
    val rate: Int
)