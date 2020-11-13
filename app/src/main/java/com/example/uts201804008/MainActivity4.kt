package com.example.uts201804008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var tvTampil:TextView = findViewById(R.id.tv_tampil)
        val bundle = intent.extras
        if (bundle != null){
            tvTampil.setText(bundle.getString("data1"))
        }
    }
}