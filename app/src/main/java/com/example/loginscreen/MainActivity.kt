package com.example.loginscreen

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlaySong: Button
    private lateinit var btnContacts: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlaySong = findViewById(R.id.btn_play_song)
        btnContacts = findViewById(R.id.btn_contacts)

        btnPlaySong.setOnClickListener {
            val intent = Intent(this, MusicPlayer::class.java)
            startService(intent)
        }

        val batteryReceiver = BatteryNotify()
        applicationContext.registerReceiver(
            batteryReceiver,
            IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        )
    }
}