package Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase


abstract class ContactDataBase:RoomDatabase() {
    abstract fun contactDao():ContactDao
    abstract fun notesDao():NotesDao

    companion object{
        var database: ContactDataBase?=null
        fun getDataBase(context: Context): ContactDataBase {
            if (database ==null){
                database =Room.databaseBuilder(context, ContactDataBase::class.java,"contactsDB")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return database as ContactDataBase
        }
    }
}