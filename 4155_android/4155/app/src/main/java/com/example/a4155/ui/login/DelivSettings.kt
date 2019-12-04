package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.MapsActivity
import com.example.a4155.R

class DelivSettings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deliv_settings)

        val directButton = findViewById<Button>(R.id.directButton)
        directButton.setOnClickListener{
            val intent = Intent(this@DelivSettings, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}
