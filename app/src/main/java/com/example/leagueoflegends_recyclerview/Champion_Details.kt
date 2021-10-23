package com.example.leagueoflegends_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Champion_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_details)

        val championAvatar= findViewById<ImageView>(R.id.championAvatar)
        val championName= findViewById<TextView>(R.id.championName)
        val championRole = findViewById<TextView>(R.id.championRole)

        val name = intent.getStringExtra(NAME)
        val role = intent.getStringExtra(ROLE)

        val avatar = intent.getIntExtra(PICTURE,0)
        championAvatar.setImageResource(avatar)

        title= "$name Detail"

        championName.text="Name : $name"
        championRole.text="Role : $role"

    }
}