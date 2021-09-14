package Database

import androidx.lifecycle.LiveData
import androidx.room.*
import model.contact


@Dao
interface ContactDao {
    @Insert(onConflict=OnConflictStrategy.REPLACE)
    fun insertContact(contact:contact)

    @Query("SELECT * FROM Contacts")
    fun getAllContacts():LiveData<List<contact>>

    @Query("SELECT * FROM  Contacts WHERE contactId=:contactId")
    fun getContactById(contactId: Int): LiveData<contact>

    @Delete
    fun deleteContact(contact: contact)
}