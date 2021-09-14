package model

import android.provider.ContactsContract
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
data class contact(
    @PrimaryKey(autoGenerate = true) @NonNull var ContactId: Int,
    var name:String,
    var phoneNumber:String,
    var email:String,
    var imageUrl:String,
    var contactId:String,
)
