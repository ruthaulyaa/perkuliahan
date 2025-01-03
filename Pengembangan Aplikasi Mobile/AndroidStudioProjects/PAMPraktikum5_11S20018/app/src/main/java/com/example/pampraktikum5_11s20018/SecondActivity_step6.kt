//package com.example.pampraktikum5_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//
//class SecondActivity : AppCompatActivity() {
//
//    lateinit var tvResult: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//
//        tvResult = findViewById(R.id.tvResult)
//
//        var name : String= intent.getStringExtra("name").toString()
//        var age: Int = intent.getIntExtra("age", 0)
//
//        tvResult.text = "Nama kamu adalah ${name} dan kamu berusia ${age}."
//    }
//}