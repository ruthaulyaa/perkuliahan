package com.example.pampraktikum1_11s20018

fun main(args: Array<String>) {
//    var firstName: String = "Ruth"
//    var lastName: String = "Silalahi"
//    var age: Int = 20
//    println("Nama Saya adalah: ${firstName} ${lastName}, Umur Saya: ${age}")

    var data: String = " Kotlin "
    println("Panjang String adalah: ${data.length}")
    println("Apakah data string sesuai dengan kata Java? ${data.equals("Java")}")
    println("Apakah data string kosong? ${data.isEmpty()}")
    println("Menambahkan string pada data string: ${data.plus ("Programming")}")
    println("Mengubah data string menjadi huruf kapital: ${data.uppercase()}")
    println("Mengubah data string menjadi huruf kecil: ${data.lowercase()}")
    println("Menghapus whitespace yang tidak diperlukan pada data string: ${data.trim()}")
}