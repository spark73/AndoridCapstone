package com.example.a4155.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.a4155.MainActivity
import com.example.a4155.R
import com.example.a4155.Restaurant
import kotlinx.android.synthetic.main.activity_bagel.*

class Bagel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagel)

        val homebutton = findViewById<Button>(R.id.homeButton6)
        homebutton.setOnClickListener{
            val intent = Intent(this@Bagel, MainActivity::class.java)
            startActivity(intent)
        }

        val item = itemList
        val restaurantMenu = Restaurant.List!!.get("Center City Einstein Bagel Bros.")
        for (i in 0..restaurantMenu!!.items!!.size - 1) {
            val v = TextView(this)
            v.text = restaurantMenu.items.keys.elementAt(i)
            v.setTextColor(Int.MAX_VALUE)
            item.addView(v)
            for (j in 0..restaurantMenu.items.values.elementAt(i).size - 1) {
                val v1 = TextView(this)
                v1.text = "  " + restaurantMenu.items.values.elementAt(i)[j]
                v1.setTextColor(Int.MAX_VALUE)
                item.addView(v1)
            }
        }
    }
}
