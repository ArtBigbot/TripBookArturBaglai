package com.example.tripbook

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "place_table")
class Place (@PrimaryKey(autoGenerate = true)

             @ColumnInfo(name = "country")
             val country: String,
             @ColumnInfo(name = "city")
             val city:String ,
             @ColumnInfo(name ="placeName")
             val placeName:String,
             @ColumnInfo(name = "imagePath")
             val imagePath: String,
             @ColumnInfo(name = "type")
             val type: String)
{

}