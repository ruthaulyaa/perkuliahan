package com.example.pampraktikum1_11s20018

fun main(args: Array<String>) {
//    var arrList = arrayListOf<Int>();
//    arrList.add(1)
//    arrList.add(3)
//    arrList.add(5)
//    println("Ukuran array adalah: ${arrList.size}")
//    println("Nilai array kedua adalah ${arrList[1]}")
//
//    arrList.remove(1);
//    println("")
//    println("Ukuran array adalah: ${arrList.size}")
//    println("Nilai array kedua adalah ${arrList[1]}")

    var anyArray = arrayListOf<Any>(1, true)
    anyArray.add("String")
    anyArray.add(10.1f)
    anyArray.add(1000L)
    anyArray.add('T')

    println(anyArray)
    println("Ukuran array adalah: ${anyArray.size}")

    anyArray.remove(1);
    println("")
    println("Ukuran array adalah: ${anyArray.size}")
    println("Nilai array kedua adalah ${anyArray[1]}")
    println(anyArray)

}