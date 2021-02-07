package com.example.listviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class FruitAdapter(val fruits : ArrayList<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.list_item_fruit,
                parent,false
        )
        return FruitViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.itemView.tvFruitName.text = fruits[position].name
        holder.itemView.tvOrigin.text = fruits[position].origin
        holder.itemView.tvQuantity.text = fruits[position].quantity.toString()
    }

    override fun getItemCount(): Int {
        return fruits.size
    }
    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}