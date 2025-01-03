package com.example.pampraktikum2_11s20018

fun main(args: Array<String>){
    print("Silakan memasukkan angka: ")
    var num: Int = readLine()!!.toInt()
    if (num % 2 == 0){
        println("${num} adalah bilangan genap")
    } else {
        println("${num} adalah bilangan ganjil")
    }
}