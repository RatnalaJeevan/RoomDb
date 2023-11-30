package com.jeevan.projectroomdb

import androidx.room.Database
import androidx.room.RoomDatabase

//defining absatrct class telling room the database class proving entities and version

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase: RoomDatabase() {

    abstract val dao: ContactDao
}