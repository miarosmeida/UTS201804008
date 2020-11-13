package com.example.uts201804008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intent)
        val t_nomor: TextView = findViewById(R.id.tampil_nomor)
        val t_nama: TextView = findViewById(R.id.tampil_nama)

        t_nomor.setText(intent.getStringExtra("nomor"))
        t_nama.setText(intent.getStringExtra("nama"))
    }
}