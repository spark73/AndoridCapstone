package com.example.a4155

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.ui.login.Home
import com.example.a4155.ui.login.LoginActivity
import com.example.a4155.ui.login.Profile
import com.example.a4155.ui.login.google_signin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Homebutton = findViewById<Button>(R.id.Homebutton)
        Homebutton.setOnClickListener{
            val intent = Intent(this@MainActivity, Home::class.java)
            startActivity(intent)
        }


        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this@MainActivity,restauraunts::class.java)
            startActivity(intent)
        }

        val prof_button = findViewById<Button>(R.id.Profbutton)
        prof_button.setOnClickListener{
            val intent = Intent(this@MainActivity,Profile::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.SignIn)
        button1.setOnClickListener{
            val intent = Intent(this@MainActivity,LoginActivity::class.java)

            // Launches Google Sign In
            //val intent = Intent(this@MainActivity,google_signin::class.java)
            startActivity(intent)
        }


    }



}
