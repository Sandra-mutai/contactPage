package Database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import model.Notes
import model.contact

interface NotesDao {
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun insertNote(notes: Notes)

    @Query("SELECT * FROM Notes")
    fun getAllNotes(): LiveData<List<Notes>>

    @Query("SELECT * FROM  Notes WHERE noteId=:notesId")
    fun getNotesById(notesId: Int): LiveData<Notes>

    @Delete
    fun deleteNotes(notes: Notes)
}