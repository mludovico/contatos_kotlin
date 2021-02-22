package br.com.mludovico.contatos_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_item.view.*

class ContactAdapter(val contacts: ArrayList<Contact>): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder =
        ContactViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.contact_item, parent, false)
        )

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.itemView.contact_name.text = contact.name
        holder.itemView.contact_phone.text = contact.phone
    }

    override fun getItemCount(): Int = contacts.size

}

class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)