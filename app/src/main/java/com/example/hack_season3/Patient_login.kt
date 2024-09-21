package com.example.hack_season3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Patient_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_patient_login)
        var btnNext=findViewById<Button>(R.id.button)
        btnNext.setOnClickListener{
            val intent= Intent(this,Sign_in::class.java)
            startActivity(intent)
        }
    }
}