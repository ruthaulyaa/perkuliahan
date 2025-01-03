package com.example.teoripam_11s20018

fun main (args : Array<String>) {
    print("Enter the name of heavenly body: ")
    var name= readLine()!!.toString()
    when(name) {
        "Sun" -> print("Sun is a Star")
        "Moon" -> print("Moon is a Satellite")
        "Earth" -> print("Earth is a planet")
        else -> print("I don't know anything about it")
    }
}