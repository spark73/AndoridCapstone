package com.example.a4155.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4155.R
import android.content.Intent
import android.widget.Button

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val customer_button = findViewById<Button>(R.id.CustProfileButton)
        customer_button.setOnClickListener{
            val intent = Intent(this@Profile,customerSettings::class.java)
            startActivity(intent)
        }

        val deliv_button = findViewById<Button>(R.id.DelivProfileButton)
        deliv_button.setOnClickListener{
            val intent = Intent(this@Profile,DelivSettings::class.java)
            startActivity(intent)
        }

    }
}
