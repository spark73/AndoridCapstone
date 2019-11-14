package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.R

class customerSettings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_settings)

        val payButton = findViewById<Button>(R.id.payButton)
        payButton.setOnClickListener{
            val intent = Intent(this@customerSettings,paymentMethod::class.java)
            startActivity(intent)
        }
    }
}
