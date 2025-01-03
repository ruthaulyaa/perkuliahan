package com.example.mydel.util

import retrofit2.Call
import retrofit2.http.GET

interface retrofitAPi {
    @GET("/posts")
    fun getAllPosts() : Call<List<Post>>
}