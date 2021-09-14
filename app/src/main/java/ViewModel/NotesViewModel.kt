package ViewModel

import Repository.NotesRepository
import android.provider.ContactsContract
import androidx.lifecycle.ViewModel

class NotesViewModel: ViewModel() {
    var notesRepository=NotesRepository()

    fun saveNote(note: ContactsContract.CommonDataKinds.Note){

    }
}