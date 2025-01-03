package com.example.pampraktikum_11s20018

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("/posts")
    fun getAllPosts() : Call<List<Post>>
}