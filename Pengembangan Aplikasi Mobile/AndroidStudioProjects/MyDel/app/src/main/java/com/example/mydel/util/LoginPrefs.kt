package com.example.mydel.util

import android.content.Context
import android.content.SharedPreferences

class LoginPrefs(context: Context) {

    private val isLOGIN = "is_login"
    private var spLogin: SharedPreferences? = null

    init {
        spLogin = context.getSharedPreferences(isLOGIN, Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean) {
        spLogin!!.edit().putBoolean(isLOGIN, value).apply()
    }

    fun getIsLogin() : Boolean {
        return spLogin!!.getBoolean(isLOGIN, false)
    }
}