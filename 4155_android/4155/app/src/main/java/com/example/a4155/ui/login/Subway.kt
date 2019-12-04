package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.MainActivity
import com.example.a4155.R


class Subway : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)

        val homebutton = findViewById<Button>(R.id.homeButton4)
        homebutton.setOnClickListener{
            val intent = Intent(this@Subway, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
