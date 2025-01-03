package com.example.pampraktikum2_11s20018

fun main(args: Array<String>){
    print("Berapakah usiamu?")
    var age: Int = readLine()!!.toInt()
    if(age <  13){
        println("Kamu seorang anak-anak")
    } else if(age < 19){
        println("Kamu seorang remaja")
    } else{
        if(age < 65){
            println("Kamu orang dewasa")
        } else{
            println("Kamu orang tua")
        }
    }
}