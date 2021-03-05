package com.jnicovm.mercado_libre_prueba.activities.searchActivities

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.jnicovm.mercado_libre_prueba.models.response.SearchResponse
import com.jnicovm.mercado_libre_prueba.useCases.GetSearchUsesCases
import io.reactivex.disposables.CompositeDisposable
import java.lang.Exception

// Viewmodel recive como parametro un UseCase el cual es inyectado
class SearchViewmodel (private val getSearchUsesCases: GetSearchUsesCases): ViewModel(){

    fun getResource() = getSearchUsesCases.getResource()

    fun setResource(resource: String) = getSearchUsesCases.setResource(resource)

    fun getItem() = getSearchUsesCases.getItem()

    fun setItem(item: String) = getSearchUsesCases.setItem(item)

    fun buildSearchRequest(resource: String, item: String) = getSearchUsesCases.buildSearchRequest(resource, item)

    private val disposable = CompositeDisposable()

    // Se crean la variable livedata y mutablelivedata para que la información persista con el ciclo de vida de la aplicación
    private val _searchValues: MutableLiveData<SearchResponse> = MutableLiveData()
    val searchValues: LiveData<SearchResponse> get() = _searchValues

    //funcion para llamar al servicio de busqueda dentro del caso de uso
    fun perfomSearch() {
        disposable.add(
            getSearchUsesCases.invoke().subscribe {
                try {
                    // parseando json de respuesta a SearchRespone
                    _searchValues.postValue(Gson().fromJson(it.toString(), SearchResponse::class.java))
                }catch (error: Exception){
                    Log.e("EPar", error.toString())
                }

            }
        )
    }

    // limpiando los hilos del servicio
    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}