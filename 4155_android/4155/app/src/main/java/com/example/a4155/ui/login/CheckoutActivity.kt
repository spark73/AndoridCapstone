package com.example.a4155.ui.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.a4155.MainActivity
import com.example.a4155.R

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val mPaypalButton = findViewById<ImageButton>(R.id.mPaypalButton)
        mPaypalButton.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/us/signin"))
            startActivity(browserIntent)
        }

        val mVenmoButton = findViewById<ImageButton>(R.id.mVenmoButton)
        mVenmoButton.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://venmo.com/account/sign-in"))
            startActivity(browserIntent)
        }

        val mCashAppButton = findViewById<ImageButton>(R.id.mCashAppButton)
        mCashAppButton.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cash.app/login?return_to=account.index"))
            startActivity(browserIntent)
        }

        val orderbutton = findViewById<Button>(R.id.Orderbutton)
        orderbutton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
