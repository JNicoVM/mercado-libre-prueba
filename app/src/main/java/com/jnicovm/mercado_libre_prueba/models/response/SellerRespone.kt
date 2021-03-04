package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class SellerRespone(
    @SerializedName("id")
    val id: Int,
    @SerializedName("power_seller_status")
    val powerSellerStatus: String,
    @SerializedName("car_dealer")
    val carDealer: Boolean,
    @SerializedName("real_estate_agency")
    val realEstateAgency: Boolean
)