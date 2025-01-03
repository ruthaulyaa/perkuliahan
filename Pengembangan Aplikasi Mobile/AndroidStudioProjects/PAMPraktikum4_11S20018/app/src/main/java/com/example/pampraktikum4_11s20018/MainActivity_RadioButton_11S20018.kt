//package com.example.pampraktikum4_11s20018
//
//import android.graphics.Color
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.LinearLayout
//import android.widget.RadioButton
//import androidx.annotation.ColorRes
//
//class MainActivity_RadioButton : AppCompatActivity() {
//
//    lateinit var llMain: LinearLayout
//    lateinit var rbWhite: RadioButton
//    lateinit var rbRed: RadioButton
//    lateinit var rbGreen: RadioButton
//    lateinit var rbBlue: RadioButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        llMain = findViewById(R.id.llMain)
//        rbWhite = findViewById(R.id.rbWhite)
//        rbRed = findViewById(R.id.rbRed)
//        rbGreen = findViewById(R.id.rbGreen)
//        rbBlue = findViewById(R.id.rbBlue)
//
//        rbWhite.setOnClickListener{UpdateBackgroud()}
//        rbRed.setOnClickListener{UpdateBackgroud()}
//        rbGreen.setOnClickListener{UpdateBackgroud()}
//        rbBlue.setOnClickListener{UpdateBackgroud()}
//
//    }
//
//    fun UpdateBackgroud(){
//        if(rbWhite.isChecked)
//            llMain.setBackgroundColor(Color.WHITE)
//        else if(rbRed.isChecked)
//            llMain.setBackgroundColor(Color.RED)
//        else if(rbGreen.isChecked)
//            llMain.setBackgroundColor(Color.GREEN)
//        else if(rbBlue.isChecked)
//            llMain.setBackgroundColor(Color.BLUE)
//    }
//
//}