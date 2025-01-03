package com.example.pampraktikum1_11s20018

fun main(args: Array<String>) {
    var myMap = mutableMapOf<String, Int>("Abdullah" to 23, "Kevin" to 21)
    myMap.put("Abdullah", 22)
    println("Usia Abdullah: ${myMap["Abdullah"]}")
    println("Usia Kevin: ${myMap["Kevin"]}")
}