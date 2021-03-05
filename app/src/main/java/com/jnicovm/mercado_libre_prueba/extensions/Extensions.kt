package com.jnicovm.mercado_libre_prueba.extensions

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.jnicovm.mercado_libre_prueba.app.MyApplication

val Context.app: MyApplication
    get() = applicationContext as MyApplication

@Suppress("UNCHECKED_CAST")
inline fun <reified T : ViewModel> FragmentActivity.getViewModel(crossinline factory: () -> T): T {

    val viewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        override fun <U : ViewModel> create(modelClass: Class<U>): U = factory() as U
    }

    return ViewModelProvider(this.viewModelStore, viewModelFactory)[T::class.java]
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, 0)
}
