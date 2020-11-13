package com.example.uts201804008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin: Button = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}