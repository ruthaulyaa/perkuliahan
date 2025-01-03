package com.example.mydel.util


data class Post(
    val id: Int,
    val id_scholarship: Int,
    val title: String,
    val tags: String,
    val caption: String,
    val thumbnail: String,
    val registration_link: String,
    val description: String,
    val created_at: String,
    val updated_at: String?
)
