package com.example.leagueoflegends_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChampionAdapter(val championList:MutableList<Champion>) : RecyclerView.Adapter<ChampionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder{
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.recycle_single_champion,parent,false)
        return ChampionViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
       holder.
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}