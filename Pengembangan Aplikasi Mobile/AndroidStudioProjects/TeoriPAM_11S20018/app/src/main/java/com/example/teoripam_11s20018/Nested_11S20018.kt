package com.example.teoripam_11s20018

fun main() {
    val a = 8

    if(a%2==0) {
        println("$a is even number.")
        if(a%5==0) {
            println("$a is divisible by 5.")
        } else if(a%3==0) {
            println("$a is divisible by 3.")
        }
    }
}