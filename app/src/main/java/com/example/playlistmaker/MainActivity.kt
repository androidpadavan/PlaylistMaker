package com.example.playlistmaker

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.playlistmaker.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val cardSearch: CardView = findViewById(R.id.cardSearch)
        val cardMedia: CardView = findViewById(R.id.cardMedia)
        val cardSettings: CardView = findViewById(R.id.cardSettings)

        cardSearch.setOnClickListener {
            Toast.makeText(applicationContext, "Открываю поиск", Toast.LENGTH_SHORT).show()
        }

        cardMedia.setOnClickListener {
            Toast.makeText(applicationContext, "Открываю медиатеку", Toast.LENGTH_SHORT).show()
        }

        cardSettings.setOnClickListener {
            Toast.makeText(applicationContext, "Открываю настройки", Toast.LENGTH_SHORT).show()
        }
    }
}