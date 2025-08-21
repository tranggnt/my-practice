package com.example.roomdatabase.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.concurrent.atomic.DoubleAdder

@Entity ( "User" )
data class Note (
    val title: String,
    val description: String,
    val dateAdder: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

)
