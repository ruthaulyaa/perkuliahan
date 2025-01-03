package com.example.mydel.data.remote.responseLogin

data class ResponseLogin(
    val result: Boolean,
    val error: String,
    val success: String,
    val user: User,
    val token: String,
    val refresh_token: String
)
