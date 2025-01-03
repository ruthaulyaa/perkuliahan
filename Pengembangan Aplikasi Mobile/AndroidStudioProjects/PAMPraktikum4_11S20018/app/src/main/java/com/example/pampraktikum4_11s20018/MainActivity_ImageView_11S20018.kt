//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ImageView
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var ivEmot : ImageView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ivEmot = findViewById(R.id.ivEmot)
//
//        ivEmot.setOnClickListener{
//            if(ivEmot.getDrawable().getConstantState()!!.equals(ivEmot.getContext().getDrawable(R.drawable.happy)!!.getConstantState())){
//                ivEmot.setImageResource(R.drawable.nervous)
//            }else{
//                ivEmot.setImageResource(R.drawable.happy)
//            }
//        }
//
//    }
//}