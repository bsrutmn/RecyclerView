package com.busrautmn.recyclerview.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busrautmn.recyclerview.dto.SoundsDTO


class SoundsAdapter(private  val soundList : List<SoundsDTO>,
                    private  val onItemClick:(view : View ,soundsDTO: SoundsDTO)->Unit):
        RecyclerView.Adapter<SoundsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundsViewHolder = SoundsViewHolder(parent)
    override fun getItemCount(): Int = soundList.size
    override fun onBindViewHolder(holder: SoundsViewHolder, position: Int) {
        holder.bindTo(soundList[position]){view, soundsDTO ->
            onItemClick(view,soundsDTO)
        }
    }
}
