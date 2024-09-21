package com.example.hack_season3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class acc_created : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_acc_created)
        var btnNext2=findViewById<Button>(R.id.button3)
        btnNext2.setOnClickListener {
            val intent= Intent(this,Com_Profile::class.java)
            startActivity(intent)
        }
    }
}