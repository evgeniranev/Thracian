package com.example.thracian.subcategory

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thracian.R

class SubCategoryAdapter : RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>() {

    var list = emptyList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubCategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_subcategory, parent, false)

        return SubCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubCategoryViewHolder, position: Int) {
        Log.i("blah",list[position] )
        holder.guzView.text = list[position]
    }

    override fun getItemCount(): Int {
        Log.i("blah", list.size.toString())

        return list.size
    }

    fun setData(list:ArrayList<String>){
        this.list = list
        notifyDataSetChanged()
    }


    inner class SubCategoryViewHolder(guz: View) : RecyclerView.ViewHolder(guz) {
        val guzView: TextView

        init {
            // Define click listener for the ViewHolder's View.
           guzView = guz.findViewById(R.id.subcategory_textView)
        }
    }
}

