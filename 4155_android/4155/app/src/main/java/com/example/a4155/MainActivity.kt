package com.example.a4155

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a4155.ui.login.Home
import com.example.a4155.ui.login.LoginActivity
import com.example.a4155.ui.login.Profile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Homebutton = Homebutton
        Homebutton.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val button = button3
        button.setOnClickListener{
            val intent = Intent(this, RestaurantListActivity::class.java)
            startActivity(intent)
        }

        val prof_button = Profbutton
        prof_button.setOnClickListener{
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }

        val button1 = SignIn
        button1.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        shoppingCartButton.setOnClickListener {
            val intent = Intent(this, ShoppingCartActivity::class.java)
            startActivity(intent)
        }

        val stream = assets.open("menu.csv")
        Restaurant.load(stream)
        stream.close()
    }



}
