package com.example.mydel.data.remote.responseLogin

data class User(
    val user_id: Int,
    val username: String,
    val email: String,
    val role: String,
    val status: Int
)
val admin = User(
    user_id = 1,
    username = "admin",
    email = "admin123",
    role = "admin",
    status = 1
)