package com.example.contactpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class cantactRecycleview (var contactList: List<contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhoneNumber.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
    }

    override fun getItemCount(): Int {
        return contactList.size


    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvphoneNumberLbl)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
}