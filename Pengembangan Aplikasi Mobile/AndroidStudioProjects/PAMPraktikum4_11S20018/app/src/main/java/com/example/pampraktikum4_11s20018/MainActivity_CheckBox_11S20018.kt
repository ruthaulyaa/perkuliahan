//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.CheckBox
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var tvResult: TextView
//    lateinit var cbLK: CheckBox
//    lateinit var cbPR: CheckBox
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        tvResult = findViewById(R.id.tvResult)
//        cbLK = findViewById(R.id.cbLK)
//        cbPR = findViewById(R.id.cbPR)
//
//        cbLK.setOnClickListener{
//            if(cbLK.isChecked){
//                tvResult.text = "Kamu berjenis kelamin laki-laki"
//                cbPR.isChecked = false // uncheck the other checkbox
//            } else {
//                tvResult.text = "Apa jenis kelamin kamu?"
//            }
//        }
//
//        cbPR.setOnClickListener{
//            if(cbPR.isChecked){
//                tvResult.text = "Kamu berjenis kelamin perempuan"
//                cbLK.isChecked = false // uncheck the other checkbox
//            } else {
//                tvResult.text = "Apa jenis kelamin kamu?"
//            }
//        }
//
//
//    }
//}