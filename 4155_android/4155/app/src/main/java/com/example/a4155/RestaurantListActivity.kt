package com.example.a4155

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_restaurant_list.*

class RestaurantListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_list)

        var count = 0
        var row = TableRow(this)
        var added = false

        for (restaurant in Restaurant.getRestaurants()) {
            val view = Button(this)
            view.text = restaurant.key
            view.setTextColor(Color.BLACK)
            view.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
            view.id = View.generateViewId()

            view.setOnClickListener({
                val intent = Intent(this, RestaurantViewActivity::class.java)
                intent.putExtra("restaurantName", restaurant.key)

                startActivity(intent)
            })

            row.addView(view)
            ++count

            if (count % 2 == 0 && count != 0) {
                list.addView(row)
                row = TableRow(this)
                added = false
            } else {
                added = true
            }
        }

        if (added) {
            list.addView(row)
        }
    }
}
