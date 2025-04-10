//package com.example.pampraktikum6_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentTransaction
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var etWeight: EditText
//    lateinit var etHeight: EditText
//    lateinit var btnCalculate: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        etWeight = findViewById(R.id.etWeight)
//        etHeight = findViewById(R.id.etHeight)
//        btnCalculate = findViewById(R.id.btnCalculate)
//
//        val fragmentManager: FragmentManager = supportFragmentManager
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//
//        val bmiFragment = BMIFragment()
//
//        btnCalculate.setOnClickListener {
//            val weight = etWeight.text.toString().toInt()
//            val height = etHeight.text.toString().toInt()
//
//            val bundle = Bundle()
//
//            bundle.putInt("weight", weight)
//            bundle.putInt("height", height)
//
//            bmiFragment.arguments = bundle
//            fragmentTransaction.add(R.id.flResult, bmiFragment)
//            fragmentTransaction.commit()
//        }
//    }
//}