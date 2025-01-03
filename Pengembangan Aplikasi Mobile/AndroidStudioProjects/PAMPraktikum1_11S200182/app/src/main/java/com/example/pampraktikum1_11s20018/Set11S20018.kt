package com.example.pampraktikum1_11s20018

fun main(args: Array<String>){
//    var mySet = arrayListOf<Int>(1, 2, 2, 3,3, 4, 4, 4, 2)
    var mySet = setOf<Int>(1, 2, 2, 3,3, 4, 4, 4, 2)
    println("Ukuran Set: ${mySet.size}")
    println("Nilai terakhir Set: ${mySet.last()}")
}