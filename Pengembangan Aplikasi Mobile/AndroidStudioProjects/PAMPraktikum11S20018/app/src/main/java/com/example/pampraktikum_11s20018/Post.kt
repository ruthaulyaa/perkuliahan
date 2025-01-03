package com.example.pampraktikum_11s20018

import com.google.gson.annotations.SerializedName

class Post (
    val userId : Int,
    val id : Int,
    val title : String,
    @SerializedName("body")
    val subtitle : String
)