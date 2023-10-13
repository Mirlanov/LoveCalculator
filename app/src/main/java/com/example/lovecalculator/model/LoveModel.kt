package com.example.lovecalculator.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "love.table")

data class LoveModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,
    var date: String
)
