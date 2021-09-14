package UI

import ViewModel.ContactViewModel
import android.os.Bundle
import android.provider.ContactsContract
//import android.view.View.inflate
//import android.view.inputmethod.InputBinding
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactpage.ContactAdapter
import com.example.contactpage.R
//import model.contact
//import com.example.contactpage.contactAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding:MainActivityBinding
    lateinit var rvcontacts:RecyclerView
    val contactViewModel:ContactViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactViewModel.getAllContact()
        contactViewModel.getContactById(contactId = 1)
    }

    override fun onResume() {
        super.onResume()
        contactViewModel.contactsLiveData.observe(this,{contacts ->
            displayContacts(contacts)
        })
    }
    fun displayContacts(contactsList:List<ContactsContract.Contacts>){

        rvcontacts=findViewById(R.id.rvContacts)
        var contactsAdapter= ContactAdapter(contactsList,baseContext)
        rvcontacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            rvcontacts.adapter=contactsAdapter
        }
    }
}

class MainActivityBinding {

}
