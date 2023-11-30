package com.jeevan.projectroomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(

    val firstname:String,
    val lastname:String,
    val phonenum:String,
    @PrimaryKey(autoGenerate = true)
val id:Int=0
    )
