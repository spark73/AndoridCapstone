package com.example.a4155

import com.opencsv.CSVReader

import java.io.File
import java.io.FileReader
import java.io.InputStream
import java.util.ArrayList
import java.util.HashMap

class Restaurant {
    class MenuItem(val name: String, val price: Double) {
        fun canAfford(money: Double): Boolean {
            return money >= price
        }
    }

    class Category {
        val items = ArrayList<MenuItem>()
    }

    var categories = HashMap<String, Category>()

    companion object {
        private val List: HashMap<String, Restaurant> = HashMap()

        fun getRestraurant(name: String): Restaurant {
            return List[name]!!
        }

        fun getRestaurants(): HashMap<String, Restaurant> {
            return List;
        }

        fun load(stream: InputStream) {
            List.clear()

            val reader = CSVReader(stream.reader())
            val myEntries = reader.readAll()

            myEntries.removeAt(0)

            for (line in myEntries) {
                if (!List.containsKey(line[0])) {
                    List[line[0]] = Restaurant()
                }
                val r = List.get(line[0])
                if (!r!!.categories.containsKey(line[1])) {
                    r!!.categories[line[1]] = Category()
                }
                r!!.categories[line[1]]!!.items.add(MenuItem(line[2], line[3].toDouble()))
            }
        }
    }
}