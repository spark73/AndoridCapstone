package com.example.a4155

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.marginRight
import kotlinx.android.synthetic.main.activity_restaurant_view.*

class RestaurantViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_view)

        val restaurantName = intent.extras!!.getString("restaurantName") as String

        val restaurantMenu = Restaurant!!.getRestraurant(restaurantName)
        for (i in 0..restaurantMenu!!.categories!!.size - 1) {
            val v = TextView(this)
            v.text = restaurantMenu.categories.keys.elementAt(i)
            v.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24f)
            v.setTextColor(Color.WHITE)
            val categoryRow = TableRow(this)
            categoryRow.addView(v)
            list.addView(categoryRow)

            for (j in 0..restaurantMenu.categories.values.elementAt(i).items.size - 1) {
                val menuItem = restaurantMenu.categories.values.elementAt(i).items[j]
                val itemRow = TableRow(this)
                val v1 = TextView(this)
                val v2 = TextView(this)

                v1.text = menuItem.name + "    "
                v2.text = "$" + menuItem.price

                v1.setTextColor(Color.WHITE)
                v2.setTextColor(Color.WHITE)

                itemRow.setOnClickListener({
                    ShoppingCart.MyShoppingCart.addItem(menuItem)
                })

                itemRow.addView(v1)
                itemRow.addView(v2)

                list.addView(itemRow)
            }
        }
    }
}
