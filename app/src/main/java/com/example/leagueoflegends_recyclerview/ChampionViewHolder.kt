package com.example.leagueoflegends_recyclerview

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ChampionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val champPic = itemView.findViewById<ImageView>(R.id.champion_avatar)

}