package com.example.setimage

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customClass (var context:Context, var mangmonan:ArrayList<Monan>):BaseAdapter {
    class viewHolder(row:View){
        var textviewtenmonan :TextView
        var imageviewmonan:ImageView
        init {
            textviewtenmonan = row as TextView
            imageviewmonan = row as ImageView
        }
    }
    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewholder: RecyclerView.ViewHolder
    }

}