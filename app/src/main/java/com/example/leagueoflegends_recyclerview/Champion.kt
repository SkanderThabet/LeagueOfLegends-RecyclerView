package com.example.leagueoflegends_recyclerview

import android.graphics.Picture
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes

const val Picture="PICTURE"
const val NAME="NAME"
const val ROLE="ROLE"
data class Champion(
   @DrawableRes
   val championAvatar:Int,
   val championName:String,
   val championRole:String
){

}