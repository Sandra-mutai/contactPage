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
            contact("sandra","070641515","sandra@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU" ),
            contact("mutai","0706456101","mutai@gmail.com", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("jackie","0756415101","jackie@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU",),
            contact("shaline","070641095101","shaline@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("lidya","0756715101","lidya@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("brian","0706415761","brian@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("kevin" ,"0706935101","kevin@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("allan","07876415101","allan@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU"),
            contact("ivon","0706826101","ivon@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4dSL56cuk6q9T2n3CoKeFAt3Fc0UvPFXkJQ&usqp=CAU")
        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=contactAdapter(ContactList,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter
    }
}
