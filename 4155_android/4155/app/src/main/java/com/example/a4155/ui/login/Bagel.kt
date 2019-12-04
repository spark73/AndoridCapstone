package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.MainActivity
import com.example.a4155.R

class Bagel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagel)

        val homebutton = findViewById<Button>(R.id.homeButton6)
        homebutton.setOnClickListener{
            val intent = Intent(this@Bagel, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
