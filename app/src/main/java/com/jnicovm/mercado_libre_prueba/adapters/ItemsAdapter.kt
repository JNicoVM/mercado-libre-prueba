package com.jnicovm.mercado_libre_prueba.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jnicovm.mercado_libre_prueba.R
import com.jnicovm.mercado_libre_prueba.databinding.HolderItemBinding
import com.jnicovm.mercado_libre_prueba.extensions.CallbackT
import com.jnicovm.mercado_libre_prueba.models.response.ResultsResponse

class ItemsAdapter : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {

    private var itemsList = listOf<ResultsResponse>()
    private lateinit var callbackClickItem : CallbackT<ResultsResponse>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemsViewHolder (
            LayoutInflater.from(parent.context).inflate(
                    R.layout.holder_item, parent, false
            )
        )

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        val item = itemsList[position]
        holder.binding.tvNombreItem.text = item.title
        holder.binding.tvPrecioItem.text = item.price.toString()
        holder.binding.llElegido.setOnClickListener {
            callbackClickItem(item)
        }
    }

    override fun getItemCount(): Int = itemsList.size

    fun updateItem(items: ArrayList<ResultsResponse>){
        this.itemsList = items
        notifyDataSetChanged()
    }

    fun onUserClicked(
        callbackClickItem:  CallbackT<ResultsResponse>
    ) {
        this.callbackClickItem = callbackClickItem
    }

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: HolderItemBinding =
                HolderItemBinding.bind(itemView)
    }

}