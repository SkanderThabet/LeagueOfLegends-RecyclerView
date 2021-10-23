package com.example.leagueoflegends_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ChampionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val champPic = itemView.findViewById<ImageView>(R.id.champion_avatar)
    val champName= itemView.findViewById<TextView>(R.id.champion_name)
    val champRole = itemView.findViewById<TextView>(R.id.role_champion)

}