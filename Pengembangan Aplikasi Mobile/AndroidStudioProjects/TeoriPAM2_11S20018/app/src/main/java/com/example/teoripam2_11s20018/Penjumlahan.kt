package com.example.teoripam2_11s20018

fun main(args: Array<String>) {
    print("Masukkan angka pertama ")
    var num1: Int =Integer.valueOf(readLine())
    print("Masukkan angka kedua ")
    var num2: Int =Integer.valueOf(readLine())
    println("Bilangan anda $num1 dan $num2")
    var hasil:Int = num1 + num2
    println("Hasil kedua angka = $hasil")
    if (num1<num2){
        print("Angka tekecil adalah $num1")
    } else {
        print("Angka terkecil adalah $num2")
    }
}