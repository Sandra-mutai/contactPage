package com.example.contactpage

import android.content.Context
import android.content.Intent
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook_contacts.contactDetailsActivity
import com.squareup.picasso.Picasso

class contactAdapter (var contactList: List<contact> ,var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhoneNumber.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email

        holder.cvContact.setOnClickListener{
            var intent=Intent(context,contactDetailsActivity::class.java)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("phoneNumber",currentContact.phoneNumber)
//            intent.putExtra("image"),currentContact.imageUrl
            context.startActivity(intent)
        }
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivContact)
        holder.cvContact.setOnClickListener{
        }
    }

    override fun getItemCount(): Int {
        return contactList.size


    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvphoneNumberLbl)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContact=itemView.findViewById<ImageView>(R.id.cvContact)
}