package Repository

import Database.ContactDataBase
import androidx.lifecycle.LiveData
import com.example.contactpage.ContactApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
//import model.contact

class ContactsRepository {
    val database=ContactDataBase.getDataBase(ContactApp.appContext)

    suspend fun saveContact(contact:Contact){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contact)
        }
    }
    fun getAllContacts(): LiveData<List<Contact>> {
        return database.contactDao().getAllContacts()
    }
    fun getContactsById(contactId:Int):LiveData<Contact>{
        return database.contactDao().getContactById(contactId)
    }}
