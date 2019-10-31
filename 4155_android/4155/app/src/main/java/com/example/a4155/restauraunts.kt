package com.example.a4155

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.example.a4155.ui.login.*


class restauraunts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restauraunts)

        // Press Bojangles button to go to BoPage
        val bojangles_button = findViewById<Button>(R.id.boButton)
        bojangles_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Bojangles::class.java)
            startActivity(intent)
        }

        // Press Chick-fil-A button to ChickPage
        val cfa_button = findViewById<Button>(R.id.C_F_AButton)
        cfa_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Chick::class.java)
            startActivity(intent)
        }

        // // Press Starbucks button to StarPage
        val starbucks_button = findViewById<Button>(R.id.StarButton)
        starbucks_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Starbucks::class.java)
            startActivity(intent)
        }

        // Press Wendy's button to WenPage
        val wendys_button = findViewById<Button>(R.id.WenButton)
        wendys_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Wendys::class.java)
            startActivity(intent)
        }

        // Press Einstiens button to EinPage
        val bagel_button = findViewById<Button>(R.id.EinButton)
        bagel_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Bagel::class.java)
            startActivity(intent)
        }

        // Press Subway button to SubPage
        val sub_button = findViewById<Button>(R.id.SubButton)
        sub_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Subway::class.java)
            startActivity(intent)
        }


        // Add other restaurants onClick function here perhaps maybe if necessary
        // or maybe just work on these 6 for now
    }

}
