package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.MainActivity
import com.example.a4155.R

class Starbucks : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starbucks)

        val homebutton = findViewById<Button>(R.id.homeButton3)
        homebutton.setOnClickListener{
            val intent = Intent(this@Starbucks, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
