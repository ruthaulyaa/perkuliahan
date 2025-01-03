//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import androidx.core.view.isVisible
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var tvNIM : TextView
//    lateinit var btnShowHide : Button
//
//    var isVisibleNIM = true
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        tvNIM = findViewById(R.id.tvNIM);
//        btnShowHide = findViewById(R.id.btnShowHide)
//
//        tvNIM.setText("NIM Saya: 11S20018")
//
//        btnShowHide.setOnClickListener {
//            isVisibleNIM = !isVisibleNIM
//            tvNIM.isVisible = isVisibleNIM
//            if(isVisibleNIM){
//                btnShowHide.setText("Hide")
//            }else{
//                btnShowHide.setText("Show")
//            }
//        }
//    }
//}