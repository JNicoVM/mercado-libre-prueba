package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class ResultsResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("site_id")
    val siteId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("seller")
    val seller: SellerRespone,
    @SerializedName("price")
    val price: Double,
    @SerializedName("available_quantity")
    val availableQuantity: Int,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("installments")
    val installments: InstallmentsResponse,
    @SerializedName("shipping")
    val shipping: ShippingResponse,
    @SerializedName("condition")
    val condition: String,
    @SerializedName("sold_quantity")
    val soldQuantity: Double,
    @SerializedName("address")
    val address: AddressResponse

)