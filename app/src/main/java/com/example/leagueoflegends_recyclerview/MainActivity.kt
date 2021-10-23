package com.example.leagueoflegends_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recylcerChampionAdapter: ChampionAdapter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_champion)
        var champList : MutableList<Champion> = ArrayList()

        champList.add(Champion(championAvatar = R.drawable.ic_leesin, championName = "Lee Sin", championRole = "COMBATTANT: Jungler" ))
        champList.add(Champion(championAvatar = R.drawable.ic_missfortune, championName = "Miss Fortune", championRole = "TIREUR: ADC" ))
        champList.add(Champion(championAvatar = R.drawable.ic_thresh, championName = "Thresh", championRole = "SUPPORT" ))
        champList.add(Champion(championAvatar = R.drawable.ic_nasus, championName = "Nasus", championRole = "COMBATTANT: Top" ))
        champList.add(Champion(championAvatar = R.drawable.ic_ahri, championName = "Ahri", championRole = "MAGE: MID" ))
        champList.add(Champion(championAvatar = R.drawable.ic_annie, championName = "Annie", championRole = "MAGE: MID" ))
        champList.add(Champion(championAvatar = R.drawable.ic_ashe, championName = "Ashe", championRole = "TIREUR: ADC" ))
        champList.add(Champion(championAvatar = R.drawable.ic_blitzcrank, championName = "Blitzcrank", championRole = "TANK: Support" ))
        champList.add(Champion(championAvatar = R.drawable.ic_ekko, championName = "Ekko", championRole = "ASSASSIN: MID/Jungle" ))
        champList.add(Champion(championAvatar = R.drawable.ic_quinn, championName = "Quinn", championRole = "TIREUR: TOP" ))
        champList.add(Champion(championAvatar = R.drawable.ic_velkoz, championName = "Velkoz", championRole = "MAGE: MID/Support" ))

        recylcerChampionAdapter=ChampionAdapter(champList)
        recyclerView.adapter= recylcerChampionAdapter
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}