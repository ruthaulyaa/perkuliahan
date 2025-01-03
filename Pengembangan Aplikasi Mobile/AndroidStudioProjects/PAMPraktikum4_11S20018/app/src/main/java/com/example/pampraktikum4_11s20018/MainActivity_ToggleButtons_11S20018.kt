//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.ImageView
//import android.widget.ToggleButton
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var ivEmot: ImageView
//    lateinit var tbShowHide: ToggleButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ivEmot = findViewById(R.id.ivEmot)
//        tbShowHide = findViewById(R.id.tbShowHide)
//
//        tbShowHide.setOnCheckedChangeListener{buttonView, isChecked ->
//            if(isChecked)
//                ivEmot.visibility = View.INVISIBLE
//            else
//                ivEmot.visibility = View.VISIBLE
//        }
//    }
//
//}