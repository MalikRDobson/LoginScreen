package com.example.loginscreen

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.fragment.app.Fragment
import androidx.loader.app.LoaderManager
import androidx.loader.content.Loader

class ContactsFragment: Fragment(){

    lateinit var contactsList: ListView
    private var cursorAdapter: SimpleCursorAdapter? = null
    private val contactsArray: Array<String> = arrayOf(ContactsContract.Contacts.DISPLAY_NAME)
    private val rArray: IntArray = intArrayOf(android.R.id.text1)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_contact, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.also {
            contactsList = it.findViewById<ListView>(R.id.list_contacts)
            cursorAdapter = SimpleCursorAdapter(
                it,
                R.layout.item_contact,
                null,
                contactsArray, rArray,
                0
            )
        }
    }
}