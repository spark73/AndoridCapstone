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

        // Press Crown commons button to SubPage
        val crown_button = findViewById<Button>(R.id.crownCmmns)
        crown_button.setOnClickListener{
            val intent = Intent(this@restauraunts, crownCommons::class.java)
            startActivity(intent)
        }

        // Press Panda express button to SubPage
        val panda_button = findViewById<Button>(R.id.pandaButton)
        panda_button.setOnClickListener{
            val intent = Intent(this@restauraunts, PandaExpress::class.java)
            startActivity(intent)
        }

        // Press Fusion button to SubPage
        val fusion_button = findViewById<Button>(R.id.fusionButton)
        fusion_button.setOnClickListener{
            val intent = Intent(this@restauraunts, FusionCafe::class.java)
            startActivity(intent)
        }

        // Press Domino's button to SubPage
        val dom_button = findViewById<Button>(R.id.dominosButton)
        dom_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Dominos::class.java)
            startActivity(intent)
        }

        // Press Salsarita's button to SubPage
        val salsa_button = findViewById<Button>(R.id.salsaritasButton)
        salsa_button.setOnClickListener{
            val intent = Intent(this@restauraunts, Salsaritas::class.java)
            startActivity(intent)
        }

        // Press Mamma Leone's button to SubPage
        val leones_button = findViewById<Button>(R.id.leonesButton)
        leones_button.setOnClickListener{
            val intent = Intent(this@restauraunts, mammaLeones::class.java)
            startActivity(intent)
        }




    }

}
