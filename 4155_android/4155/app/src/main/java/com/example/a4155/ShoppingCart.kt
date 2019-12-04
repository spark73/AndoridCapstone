package com.example.a4155

class ShoppingCart {
    class CartItem(val item: Restaurant.MenuItem) {
        var quantity = 0

        fun increment() {
            ++quantity
        }

        fun increment(count: Int) {
            quantity += count
        }

        fun decrement() {
            --quantity
        }

        fun decrement(count: Int) {
            quantity -= count
        }
    }

    public val items = ArrayList<CartItem>()

    fun addItem(item: Restaurant.MenuItem, quantity: Int = 1) {
        if (itemExists(item)) {
            items[indexOf(item)].increment(quantity)
        } else {
            val cartItem = CartItem(item)
            cartItem.increment()
            items.add(cartItem)
        }
    }

    fun itemExists(item: Restaurant.MenuItem): Boolean {
        for (cartItem in items) {
            if (cartItem.item == item) {
                return true
            }
        }

        return false
    }

    fun indexOf(item: Restaurant.MenuItem): Int {
        for (i in 0 until items.size) {
            if (items[i].item == item) {
                return i
            }
        }

        return -1
    }

    fun totalCost(): Double {
        var cost = 0.0

        for (cartItem in items) {
            cost += cartItem.quantity * cartItem.item.price
        }

        return cost
    }

    companion object {
        val MyShoppingCart = ShoppingCart()
    }
}