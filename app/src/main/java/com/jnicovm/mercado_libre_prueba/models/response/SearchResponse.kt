package com.jnicovm.mercado_libre_prueba.models.response

import com.google.gson.annotations.SerializedName


data class SearchResponse (
    @SerializedName("site_id")
    val siteId: String,
    @SerializedName("query")
    val query: String,
    @SerializedName("paging")
    val paging: PagingResponse,
    @SerializedName("photoURL")
    val photoURL: String,
    @SerializedName("created")
    val created: String,
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("results")
    val results: ArrayList<ResultsResponse>
)
