package com.example.uts201804008

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val edit_nomor: EditText = findViewById(R.id.edit_nomor)
        val edit_nama: EditText = findViewById(R.id.edit_nama)
        val btn_logo: Button = findViewById(R.id.btn_logo)
        val btn_profil: Button = findViewById(R.id.btn_profil)
        val btn_intent: Button = findViewById(R.id.btn_intent)
        val btn_intentImplicit: Button = findViewById(R.id.btn_IntentImplicit)
        btn_logo.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        btn_profil.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }

        btn_intent.setOnClickListener {
            val intent = Intent(this, MainActivityIntent::class.java)
            intent.putExtra("nomor", edit_nomor.text.toString())
            intent.putExtra("nama", edit_nama.text.toString())
            startActivity(intent)
        }
        btn_intentImplicit.setOnClickListener {
            val panggil_nomor = edit_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }
    }
}