package com.example.leagueoflegends_recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChampionAdapter(val championList: MutableList<Champion>) :
    RecyclerView.Adapter<ChampionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_single_champion, parent, false)
        return ChampionViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
        /**
         * Calling champion's details
         */
        val name = championList[position].championName
        val role = championList[position].championRole
        val avatar = championList[position].championAvatar

        /**
         * Holder represents the contents of the item at a given position that will get updated
         */

        holder.champPic.setImageResource(avatar)
        holder.champName.text = name
        holder.champRole.text = role

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Champion_Details::class.java)
            intent.apply {
                putExtra(PICTURE, avatar)
                putExtra(NAME, name)
                putExtra(ROLE, role)
            }
            holder.itemView.context.startActivities(arrayOf(intent))
        }
    }

    override fun getItemCount(): Int {
        return championList.size
    }

}