package com.jnicovm.mercado_libre_prueba.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jnicovm.mercado_libre_prueba.R
import com.jnicovm.mercado_libre_prueba.databinding.HolderItemBinding
import com.jnicovm.mercado_libre_prueba.extensions.CallbackT
import com.jnicovm.mercado_libre_prueba.models.response.InstallmentsResponse
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse
import com.squareup.picasso.Picasso

class ItemsAdapter : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {

    //Lista de items que va a usar el adaptador
    private var itemsList = listOf<ResultsResponse>()

    //Callback para ejecutar el evento en la actividad que instancio al adaptador
    private lateinit var callbackClickItem : CallbackT<ResultsResponse> // callback generico <T>

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: HolderItemBinding =
            HolderItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemsViewHolder (
            LayoutInflater.from(parent.context).inflate(
                    R.layout.holder_item, parent, false
            )
        )

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        val item = itemsList[position]
        initUi(holder, item)
        initListeners(holder, item)
    }

    override fun getItemCount(): Int = itemsList.size

    //Funcion para actualizar la informacion del adaptador y instaciarlo solo una vez
    fun updateItem(items: ArrayList<ResultsResponse>){
        this.itemsList = items
        notifyDataSetChanged()
    }

    // inicializacion del callback
    fun onUserClicked(
        callbackClickItem:  CallbackT<ResultsResponse>
    ) {
        this.callbackClickItem = callbackClickItem
    }

    //LLenar la informacion de la vista segun el item
    @SuppressLint("SetTextI18n")
    private fun initUi(holder: ItemsViewHolder, item: ResultsResponse){
        holder.binding.tvNombreItem.text = item.title
        holder.binding.tvPrecioItem.text = item.price.toString()
        holder.binding.tvCuotasItem.text = checkInstallments(holder, item.installments)
        holder.binding.tvShipping.text = checkFreeShipping(holder, item.shipping.free_shipping)
        Picasso.get()
            .load(item.thumbnail)
            .resize(250, 250)
            .into(holder.binding.ivItem)
    }

    //Inicializar los listeners
    private fun initListeners(holder: ItemsViewHolder, item: ResultsResponse){
        holder.binding.llElegido.setOnClickListener {
            callbackClickItem(item)
        }
    }

    //Funcion que revisa si el item tiene la opcion de cuotas, si es null oculta el campo y sus respectivos pixeles
    private fun checkInstallments(holder: ItemsViewHolder, installments: InstallmentsResponse): String{
        return if(installments == null){
            holder.binding.tvCuotasItem.visibility = View.GONE
            ""
        }else{
            "en ${installments.quantity}x \$ ${installments.quantity} "
        }
    }

    //Funcion que revisa si el item cuanta con envio gratuito
    private fun checkFreeShipping(holder: ItemsViewHolder,freeShipping: Boolean): String{
        return if(freeShipping){
            "Envio gratis"
        }else{
            holder.binding.tvShipping.visibility = View.GONE
            ""
        }
    }



}