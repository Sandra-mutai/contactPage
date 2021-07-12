package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Name()
    }
    fun Name(){
        var ContactList= listOf<contact>(
            contact("sandra","070641515","sandra@gmail.com"),
            contact("mutai","0706456101","mutai@gmail.com"),
            contact("jackie","0756415101","jackie@gmail.com"),
            contact("shaline","070641095101","shaline@gmail.com"),
            contact("lidya","0756715101","lidya@gmail.com"),
            contact("brian","0706415761","brian@gmail.com"),
            contact("kevin" ,"0706935101","kevin@gmail.com"),
            contact("allan","07876415101","allan@gmail.com"),
            contact("ivon","0706826101","ivon@gmail.com")
        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=cantactRecycleview(ContactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter
    }
}
