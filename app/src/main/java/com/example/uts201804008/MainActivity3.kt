package com.example.uts201804008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity3 : AppCompatActivity() {
    private lateinit var rvSekolah: RecyclerView
    private var list:ArrayList<Sekolah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        rvSekolah = findViewById(R.id.rv_sekolah)
        rvSekolah.setHasFixedSize(true)
        list.addAll(DataSekolah.listData)
        showRecyclerViewListCardMode()
    }
    private fun showRecyclerViewListCardMode()
    {
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val cardSekolahAdapter =CardSekolahAdapter(list)
        rvSekolah.adapter = cardSekolahAdapter
    }
}