package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName

data class EshopResponse(
    @SerializedName("nick_name")
    val nickName: String
)