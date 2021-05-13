package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.nameView)
        val textInput = findViewById<EditText>(R.id.nameInput)
        val teamImage = findViewById<ImageView>(R.id.teamImage)

        teamImage.isInvisible = false

        button.setOnClickListener {
            Log.d("Test", "Hello")
            textView.text = textInput.text
            teamImage.isInvisible = true

            Toast.makeText(applicationContext, textInput.text, Toast.LENGTH_SHORT).show()
        }

        teamImage.setOnClickListener {
            teamImage.isInvisible = false
            textView.text = ""
        }
    }
}