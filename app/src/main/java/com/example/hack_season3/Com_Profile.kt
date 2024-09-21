package com.example.hack_season3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Com_Profile : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_profile) // Make sure the correct layout file is referenced

        val weightEditText = findViewById<EditText>(R.id.weight)
        val heightEditText = findViewById<EditText>(R.id.height)
        val genderSpinner = findViewById<Spinner>(R.id.gender)
        val ageEditText = findViewById<EditText>(R.id.age)
        val waistEditText = findViewById<EditText>(R.id.waist)
        val submitButton = findViewById<Button>(R.id.submit)
        val bmiResultTextView = findViewById<TextView>(R.id.bmiResult) // Make sure this matches the ID in the XML

        submitButton.setOnClickListener {
            val weight = weightEditText.text.toString().toFloatOrNull()
            val height = heightEditText.text.toString().toFloatOrNull()?.div(100) // Convert to meters

            if (weight != null && height != null && height > 0) {
                val bmi = weight / (height * height)
                displayBMI(bmi, bmiResultTextView)
            } else {
                Toast.makeText(this, "Please enter valid weight and height", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun displayBMI(bmi: Float, bmiResultTextView: TextView) {
        val resultText = StringBuilder("Your BMI is ${bmi.toFixed(2)}\n")

        val category = when {
            bmi < 18.5 -> "Underweight"
            bmi >= 18.5 && bmi < 24.9 -> "Normal weight"
            bmi >= 25 && bmi < 29.9 -> "Overweight"
            else -> "Obese"
        }

        resultText.append("You are classified as: $category")
        bmiResultTextView.text = resultText.toString()
    }
}

// Extension function to round float value to 2 decimal places
fun Float.toFixed(decimals: Int): String {
    return "%.${decimals}f".format(this)
}
