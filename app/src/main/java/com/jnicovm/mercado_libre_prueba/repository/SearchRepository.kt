package com.jnicovm.mercado_libre_prueba.repository

import com.jnicovm.mercado_libre_prueba.dao.SearchDao
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource
import com.jnicovm.mercado_libre_prueba.models.request.SearchRequest

// el repositorio se comunica directamente con las fuentes de datos
class SearchRepository (private val remoteSearchDataSource: RemoteSearchDataSource, //fuente de datos remota
                        private val searchDao: SearchDao // fuente de datos local (no room pero se pueda usar configurar en un futuro para eso)
) {

    fun getResource() = searchDao.getResource()

    fun setResource(resource: String) = searchDao.setResource(resource)

    fun getitem()  = searchDao.getItem()

    fun setitem(item: String) = searchDao.setItem(item)

    fun buildSearchRequest(resource: String, item: String) = searchDao.buildSearchRequest(resource = resource, item = item)
    
    fun perfomSearch(searchRequest: SearchRequest) = remoteSearchDataSource.perfomSearch(searchRequest)
}