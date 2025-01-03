package com.example.teoripam_11s20018

fun main(args: Array<String>){
    println("please enter a  number: ")

    var number: Int = readLine()!!.toInt()
    if (number % 2 != 0){
        println("$number is odd")
    } else {
        println("$number is an even")
    }
}