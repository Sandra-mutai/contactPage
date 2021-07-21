package com.example.phonebook_contacts
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.contactpage.R
import com.squareup.picasso.Picasso
class contactDetailsActivity : AppCompatActivity() {
    lateinit var ivContacts2:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        var name1 = intent.getStringExtra("name")
        var email2 = intent.getStringExtra("email")
        var phone = intent.getStringExtra("phone")

        var imageurl = intent.getStringExtra("image")
        var intentName = findViewById<TextView>(R.id.tvname1)
        var intentPhone = findViewById<TextView>(R.id.tvEmail2)
        var intentEmail = findViewById<TextView>(R.id.tvPhone)
        var image = findViewById<ImageView>(R.id.ivContact)
        Picasso.get()
            .load(imageurl)
            .resize(100,100)
            .centerCrop()
            .into(image)
        intentName.text = name1
        intentPhone.text= phone
        intentEmail.text = email2
//        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()
    }
}