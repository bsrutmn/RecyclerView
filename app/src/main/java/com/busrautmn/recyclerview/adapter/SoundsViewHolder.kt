package com.busrautmn.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.busrautmn.recyclerview.R
import com.busrautmn.recyclerview.dto.SoundsDTO

class SoundsViewHolder(val parent:ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_sounds_list,parent,false)) {

    private val imgBackground by lazy {itemView.findViewById<ImageView>(R.id.imgBackground) }




    fun bindTo(soundsDTO: SoundsDTO, onItemClick:(view : View, soundsDTO: SoundsDTO)->Unit ){
        Glide.with(itemView.context).load(soundsDTO.imageLink).into(imgBackground)

        itemView.setOnClickListener {

            onItemClick(it, soundsDTO)
        }
    }
}