package com.example.hack_season3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        var btnNext2=findViewById<Button>(R.id.button2)
        btnNext2.setOnClickListener {
            val intent= Intent(this,acc_created::class.java)
            startActivity(intent)
        }
    }
}