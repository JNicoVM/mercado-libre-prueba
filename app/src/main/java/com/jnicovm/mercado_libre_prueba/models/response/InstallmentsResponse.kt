package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class InstallmentsResponse(
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("amount")
    val amount: Double
)