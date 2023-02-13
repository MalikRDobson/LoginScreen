package com.example.loginscreen

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ListView
import android.widget.SimpleCursorAdapter

class ContactActivity : AppCompatActivity() {
    private lateinit var contactsFragment: ContactsFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        contactsFragment = ContactsFragment()
        createDisplayFragment()
    }

    private fun createDisplayFragment() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contact_container, contactsFragment)
                .commit()
    }
}