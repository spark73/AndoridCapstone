package com.example.a4155.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4155.R
import android.content.Intent
import android.widget.Button
import com.example.a4155.MainActivity

class Bojangles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bojangles)

        val homebutton = findViewById<Button>(R.id.homeButton)
        homebutton.setOnClickListener{
            val intent = Intent(this@Bojangles, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
