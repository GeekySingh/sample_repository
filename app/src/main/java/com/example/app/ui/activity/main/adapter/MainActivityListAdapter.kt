package com.example.app.ui.activity.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.data.model.ItemData

class MainActivityListAdapter(private val itemList: List<ItemData>) : RecyclerView.Adapter<MainActivityListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent)
        return ItemViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setData(itemList[position])
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var imageView: ImageView
        lateinit var title : TextView
        lateinit var description: TextView

        fun setData(data: ItemData) {

        }
    }
}