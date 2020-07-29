package com.example.fragmenthm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btnReplace : Button? =null
    private var btnAdd : Button? =null
    private var btnRemove : Button? =null

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          
        
    }

    private fun id() {
        btnReplace = findViewById(R.id.btnReplace)
        btnAdd = findViewById(R.id.btnAdd)
        btnRemove = findViewById(R.id.btnRemove)
    }
}