package com.example.a4155

import com.opencsv.CSVReader

import java.io.File
import java.io.FileReader
import java.io.InputStream
import java.util.ArrayList
import java.util.HashMap

class Restaurant {
    var items: HashMap<String, ArrayList<String>>

    init {
        items = HashMap()
    }

    companion object {
        var List: HashMap<String, Restaurant>? = null

        fun Load(stream: InputStream): HashMap<String, Restaurant> {

            val reader = CSVReader(stream.reader())
            val myEntries = reader.readAll()

            val restaurants = HashMap<String, Restaurant>()

            for (line in myEntries) {
                if (!restaurants.containsKey(line[0])) {
                    restaurants[line[0]] = Restaurant()
                }
                val r = restaurants.get(line[0])
                if (!r!!.items.containsKey(line[1])) {
                    r!!.items[line[1]] = ArrayList()
                }
                r!!.items[line[1]]!!.add(line[2])
            }

            return restaurants
        }
    }
}