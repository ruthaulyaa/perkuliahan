//package com.example.pampraktikum5_11s20018
//
//import android.content.Intent
//import android.content.IntentFilter
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import android.widget.Button
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity() {
//
//    var br = BroadcastExample()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val filter = IntentFilter()
//        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        this.registerReceiver(br, filter)
//
//    }
//
//    override fun onStop(){
//        super.onStop()
//        this.unregisterReceiver(br)
//    }
//
//}