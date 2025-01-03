package com.example.mydel.data.remote.responseMahasiswa

data class Mahasiswa(
    val dim_id: Int,
    val user_id: Int,
    val user_name: String,
    val nim: String,
    val nama: String,
    val email: String,
    val prodi_id: Int,
    val prodi_name: String,
    val fakultas: String,
    val angkatan: Int,
    val status: String
)
