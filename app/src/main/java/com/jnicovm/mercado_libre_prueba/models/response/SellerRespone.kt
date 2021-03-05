package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class SellerRespone(
    @SerializedName("id")
    val id: Int,
    @SerializedName("seller_reputation")
    val sellerReputation: SellerReputationResponse,
    @SerializedName("eshop")
    val eshop: EshopResponse? = null

)