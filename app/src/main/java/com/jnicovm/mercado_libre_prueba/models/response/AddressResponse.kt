package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class AddressResponse(
    @SerializedName("state_name")
    val stateName: String,
    @SerializedName("city_name")
    val cityName: String
)