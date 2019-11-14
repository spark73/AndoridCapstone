package com.example.a4155.ui.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.R
import kotlinx.android.synthetic.main.activity_payment_method.*
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONException
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.net.wifi.p2p.WifiP2pManager
import android.widget.ImageButton


class paymentMethod : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)

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
    }


}


