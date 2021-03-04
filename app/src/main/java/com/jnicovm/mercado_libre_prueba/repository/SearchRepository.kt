package com.jnicovm.mercado_libre_prueba.repository

import com.jnicovm.mercado_libre_prueba.dao.SearchDao
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest

class SearchRepository (private val remoteSearchDataSource: RemoteSearchDataSource,
                        private val searchDao: SearchDao
) {

    fun getResource() = searchDao.getResource()

    fun setResource(resource: String) = searchDao.setResource(resource)

    fun getitem()  = searchDao.getItem()

    fun setitem(item: String) = searchDao.setItem(item)

    fun buildSearchRequest(resource: String, item: String) = searchDao.buildSearchRequest(resource = resource, item = item)
    
    fun perfomSearch(searchRequest: SearchRequest) = remoteSearchDataSource.perfomSearch(searchRequest)
}