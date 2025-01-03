//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var etName: TextView
//    lateinit var btnSubmit: Button
//    lateinit var tvResult: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        etName = findViewById(R.id.etName)
//        btnSubmit = findViewById(R.id.btnSubmit)
//        tvResult = findViewById(R.id.tvResult)
//
//        btnSubmit.setOnClickListener{
//            val name = etName.text.toString()
//            if(! name.isEmpty()){
//                etName.text = ""
//                tvResult.text = "Hello, ${name}"
//            }
//        }
//
//    }
//}