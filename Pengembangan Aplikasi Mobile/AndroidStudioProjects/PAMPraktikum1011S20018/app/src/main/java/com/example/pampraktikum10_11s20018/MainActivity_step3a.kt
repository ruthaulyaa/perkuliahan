//package com.example.pampraktikum10_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.content.Intent
//import android.os.Bundle
//import com.example.pampraktikum10_11s20018.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var mainBinding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        mainBinding = ActivityMainBinding.inflate(layoutInflater)
//        val view = mainBinding.root
//        setContentView(view)
//
//        mainBinding.fabAdd.setOnClickListener{
//            val intent = Intent(
//                this, AddUserActivity::class.java
//            )
//            startActivity(intent)
//        }
//
//    }
//}