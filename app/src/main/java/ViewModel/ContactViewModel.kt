package ViewModel

import Repository.ContactsRepository
import android.provider.Contacts
import android.provider.ContactsContract
import android.security.identity.AccessControlProfileId
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import model.contact

class ContactViewModel: ViewModel() {
    val contactRepository = ContactsRepository()
    lateinit var contactsLiveData: LiveData<List<contact>>
    lateinit var contactLiveData: LiveData<List<contact>>

    fun saveContact(contact:contact){
        viewModelScope.launch {
            contactRepository.saveContact(contact)
        }
    }

    fun getAllContact(){
        contactsLiveData=contactRepository.getAllContacts()

    }
    fun getContactById(contactId: Int){
        val ContactId = 0
        contactLiveData=contactRepository.getContactsById(ContactId)
    }
}