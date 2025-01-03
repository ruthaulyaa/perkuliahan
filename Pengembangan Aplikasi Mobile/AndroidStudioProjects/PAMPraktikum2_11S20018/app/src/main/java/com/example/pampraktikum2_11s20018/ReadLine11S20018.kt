package com.example.pampraktikum2_11s20018

fun main(args: Array<String>){
    print("Siapa nama kamu? ")
    var name: String? = readLine()
    print("Berapa usia kamu? ")
    var age: Int = readLine()!!.toInt()

    println("Nama kmau: ${name} dan usia kamu: ${age}")
}