package com.example.fragmenthm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btnAdd : Button? =null

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view()
    }

    private fun view() {
        btnAdd = findViewById(R.id.btnAdd)
    }
}