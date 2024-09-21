package com.example.hack_season3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

class Admin_Dash : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dash)

        // Enable edge-to-edge mode (fullscreen layout with control over system UI visibility)

        // Setting up ImageView click listeners
        val myImageView: ImageView = findViewById(R.id.Find_doc)
        myImageView.setOnClickListener {
            val intent = Intent(this, Find_doctor::class.java)
            startActivity(intent)
        }
        val myImageView1: ImageView = findViewById(R.id.feed)
        myImageView1.setOnClickListener {
            val intent = Intent(this, Feedback::class.java)
            startActivity(intent)
        }

    }
}
