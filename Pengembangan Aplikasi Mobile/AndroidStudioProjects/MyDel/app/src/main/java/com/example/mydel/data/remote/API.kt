package com.example.mydel.data.remote

import com.example.mydel.data.remote.responseLogin.ResponseLogin
import com.example.mydel.data.remote.responseMahasiswa.ResponseMahasiswa
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface API {

    @FormUrlEncoded
    @POST("jwt-api/do-auth")
    fun checkUser(
        @Field("username") username: String,
        @Field("password") password: String
    ) : Call<ResponseLogin>

    @GET("library-api/mahasiswa")
    fun getDataUser(
        @Query("username") username: String,
        @Header("Authorization") token: String
    ) : Call<ResponseMahasiswa>

}