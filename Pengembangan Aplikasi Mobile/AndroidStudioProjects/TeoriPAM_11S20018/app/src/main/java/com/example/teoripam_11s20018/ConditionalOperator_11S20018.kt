package com.example.teoripam_11s20018

fun main(args: Array<String>){
    var a: Int = 6
    var b: Int = 9
    var c: Int = 13
    var result: Boolean = false

    //Conditional Operator (&&)
    result = (a > b) && (a > c)
    println("Result: " + result)

    //Conditional Operator (||)
    result = (a > b) || (a > c)
    println("Result: " + result)
}