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

    private var itemsList = listOf<ResultsResponse>()
    private lateinit var callbackClickItem : CallbackT<ResultsResponse>

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

    fun updateItem(items: ArrayList<ResultsResponse>){
        this.itemsList = items
        notifyDataSetChanged()
    }

    fun onUserClicked(
        callbackClickItem:  CallbackT<ResultsResponse>
    ) {
        this.callbackClickItem = callbackClickItem
    }

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

    private fun initListeners(holder: ItemsViewHolder, item: ResultsResponse){
        holder.binding.llElegido.setOnClickListener {
            callbackClickItem(item)
        }
    }

    private fun checkInstallments(holder: ItemsViewHolder, installments: InstallmentsResponse): String{
        return if(installments == null){
            holder.binding.tvCuotasItem.visibility = View.GONE
            ""
        }else{
            "en ${installments.quantity}x \$ ${installments.quantity} "
        }
    }

    private fun checkFreeShipping(holder: ItemsViewHolder,freeShipping: Boolean): String{
        return if(freeShipping){
            "Envio gratis"
        }else{
            holder.binding.tvShipping.visibility = View.GONE
            ""
        }
    }



}