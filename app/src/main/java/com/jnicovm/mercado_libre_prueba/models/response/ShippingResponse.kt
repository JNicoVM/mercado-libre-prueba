package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class ShippingResponse(
    @SerializedName("free_shipping")
    val free_shipping: Boolean
)