package Repository

import Database.ContactDataBase
import android.provider.ContactsContract
import com.example.contactpage.ContactApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotesRepository {
    var dataBase=ContactDataBase.getDataBase(ContactApp.context)

    fun saveNote(note: ContactsContract.CommonDataKinds.Note){
        withContext(Dispatchers.IO){
            dataBase.notesDao().insertNote(note)
        }

    }
}