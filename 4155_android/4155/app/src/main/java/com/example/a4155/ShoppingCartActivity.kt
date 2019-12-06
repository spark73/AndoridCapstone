package com.example.a4155

import android.content.Intent
import android.graphics.Color
import android.icu.text.NumberFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TableRow
import android.widget.TextView
import com.example.a4155.ui.login.CheckoutActivity
import com.example.a4155.ui.login.Home
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shopping_cart.*

class ShoppingCartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)

        val Checkoutbutton = Checkoutbutton
        Checkoutbutton.setOnClickListener{
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }

        for (cartItem in ShoppingCart.MyShoppingCart.items) {
            val nameTextView = TextView(this)
            val priceTextView = TextView(this)
            val quantityTextView = TextView(this)
            val costTextView = TextView(this)
            val addQuantityTextView = TextView(this)
            val removeQuantityTextView = TextView(this)

            nameTextView.setTextColor(Color.WHITE)
            nameTextView.text = cartItem.item.name

            priceTextView.setTextColor(Color.WHITE)
            priceTextView.text = cartItem.item.price.toString()

            quantityTextView.setTextColor(Color.WHITE)
            quantityTextView.text = cartItem.quantity.toString()

            costTextView.setTextColor(Color.WHITE)
            costTextView.text = (cartItem.item.price * cartItem.quantity).toString()

            addQuantityTextView.setTextColor(Color.WHITE)
            addQuantityTextView.text = "+"

            removeQuantityTextView.setTextColor(Color.WHITE)
            removeQuantityTextView.text = "-"

            val row = TableRow(this)

            row.addView(nameTextView)
            row.addView(priceTextView)
            row.addView(quantityTextView)
            row.addView(costTextView)
            row.addView(addQuantityTextView)
            row.addView(removeQuantityTextView)

            addQuantityTextView.setOnClickListener {
                cartItem.increment()

                quantityTextView.text = cartItem.quantity.toString()
                costTextView.text = (cartItem.item.price * cartItem.quantity).toString()

                total.text = "Total: $" + ShoppingCart.MyShoppingCart.totalCost()
            }

            removeQuantityTextView.setOnClickListener {
                cartItem.decrement()

                if (cartItem.quantity <= 0) {
                    ShoppingCart.MyShoppingCart.items.remove(cartItem)
                    list.removeView(row)
                } else {
                    quantityTextView.text = cartItem.quantity.toString()
                    costTextView.text = (cartItem.item.price * cartItem.quantity).toString()
                }

                total.text = "Total: $" + ShoppingCart.MyShoppingCart.totalCost()
            }

            list.addView(row)
        }

        total.text = "Total: $" + ShoppingCart.MyShoppingCart.totalCost()
    }
}
