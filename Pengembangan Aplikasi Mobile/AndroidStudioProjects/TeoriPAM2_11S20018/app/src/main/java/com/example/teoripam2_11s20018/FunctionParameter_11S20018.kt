package com.example.teoripam2_11s20018

fun HalloWorld(fname: String, lname: String){
    if (lname == null){
        println("hallo $fname")
    } else {
        println("hallo $fname $lname")
    }

}

fun main(){
    HalloWorld("Ruth", "Silalahi")
//    HalloWorld("Ruth")
    HalloWorld("Tiur", "Maniur")
}