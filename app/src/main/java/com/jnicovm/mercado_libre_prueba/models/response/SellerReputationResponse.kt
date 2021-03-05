package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class SellerReputationResponse(
    @SerializedName("power_seller_status")
    val powerSellerStatus: String,
    @SerializedName("level_id")
    val levelId: String
)