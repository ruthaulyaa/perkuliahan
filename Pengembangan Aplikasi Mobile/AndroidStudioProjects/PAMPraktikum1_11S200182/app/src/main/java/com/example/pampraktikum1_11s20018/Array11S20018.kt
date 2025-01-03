package com.example.pampraktikum1_11s20018

fun main(args: Array<String>){
//    var arr = arrayOf(2, 3, 6)
//    println(arr[0])
//    println(arr.get(1))
//    println(arr[2])

    var subjects = arrayOf("PABWE", 90, "PAM", 80)
    println("Sebelum Nilai Diubah")
    println("${subjects[0]}: ${subjects[1]}")
    println("${subjects[2]}: ${subjects[3]}")

    subjects.set(1, 95)
    subjects.set(2, "ALJALI")

    println("")
    println("Setelah Nilai Diubah")
    println("${subjects[0]}: ${subjects[1]}")
    println("${subjects[2]}: ${subjects[3]}")

    println("")
    println("Ukuran Array: ${subjects.size}")

}