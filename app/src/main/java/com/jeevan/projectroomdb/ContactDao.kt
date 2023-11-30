package com.jeevan.projectroomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

    //upsrt annotation update or inserts based on the id
    @Upsert
    suspend fun inserContact(contact: Contact)

    //delete the row based on id or something
    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getContactsOrderedByFirstName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastname ASC")
    fun getContactOrderedByLastname():Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phonenum ASC")
    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>
}
