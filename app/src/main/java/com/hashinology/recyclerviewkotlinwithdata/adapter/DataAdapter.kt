package com.hashinology.recyclerviewkotlinwithdata.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hashinology.recyclerviewkotlinwithdata.model.MyData
import com.hashinology.recyclerviewkotlinwithdata.ui.MyInterface
import com.hashinology.recyclerviewkotlinwithretrofit.R

class DataAdapter(val myList : List<MyData>, val context : Context, val myInterface : MyInterface) : RecyclerView.Adapter<DataAdapter.MyViews>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViews {
        val view = LayoutInflater.from(context).inflate(R.layout.tem_list, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: MyViews, position: Int) {
        val data : MyData = myList.get(position)
        holder.tvName.text = data.name
        holder.tvColour.text = data.color
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    inner class MyViews(itemView: View) : RecyclerView.ViewHolder(itemView) , View.OnClickListener{
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvColour = itemView.findViewById<TextView>(R.id.tvColor)
        var view : View = itemView
        init {
            view.setOnClickListener(this)
        }
        override fun onClick(p0: View?) {
            if (myInterface != null){
                myInterface.getInterfaceClcick(view, adapterPosition)
            }
        }

    }

}