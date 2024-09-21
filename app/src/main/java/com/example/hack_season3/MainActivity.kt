package com.example.hack_season3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnNext=findViewById<Button>(R.id.button4)
        btnNext.setOnClickListener{
            val intent=Intent(this,Patient_login::class.java)
            startActivity(intent)
        }
        var btnNext1=findViewById<Button>(R.id.button)
        btnNext1.setOnClickListener{
            val intent= Intent(this,Admin_Dash::class.java)
            startActivity(intent)
        }
    }
}