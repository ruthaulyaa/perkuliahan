package com.example.pampraktikum3_11s20018

fun main (args: Array<String>) {
//    var hewan =  Hewan11S20018("Singa", "Padang Rumput")
//    println("Hewan ${hewan.nama} mempunyai habitat di ${hewan.habitat}")

    var product = Product11S20018()
    println("Product: ${product.name} dengan harga ${product.price} dengan stok tersedia ${product.stock}")
    var product2 = Product11S20018("Kecap ABC", 12000, 5)
    println("Product: ${product2.name} dengan harga ${product2.price} dengan stok tersedia ${product2.stock}")

}