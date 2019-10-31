package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.MainActivity
import com.example.a4155.R

class Chick : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chick)

        val homebutton = findViewById<Button>(R.id.homeButton2)
        homebutton.setOnClickListener{
            val intent = Intent(this@Chick, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
