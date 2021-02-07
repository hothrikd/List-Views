package com.example.listviews

import kotlin.random.Random

data class Fruit(val name:String,val origin:String,val quantity:Int) {

    companion object{
        @JvmField
        val FruitNames = arrayOf("a","b","c","d","e","f","g","h")
        @JvmField
        val OriginPlaces = arrayOf("1","2","3","4","5","6","7","8")
        @JvmStatic
        fun genreateNRandomfruits(n:Int) : ArrayList<Fruit> {
            val fruits = ArrayList<Fruit>(n)
            for (i in 1..n)
            {
                val fruit = Fruit(FruitNames[Random.nextInt(8)], OriginPlaces[Random.nextInt(8)],Random.nextInt(10)*100)
                fruits.add(fruit)
            }
            return fruits
        }
    }

}