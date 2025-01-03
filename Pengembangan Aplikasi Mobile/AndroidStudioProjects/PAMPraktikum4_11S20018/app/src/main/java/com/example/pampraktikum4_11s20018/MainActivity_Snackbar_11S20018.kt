//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.LinearLayout
//import android.widget.Toast
//import com.google.android.material.snackbar.Snackbar
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var llMain: LinearLayout
//    lateinit var btnShowToast: Button
//    lateinit var btnShowSnackbar: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        llMain = findViewById(R.id.llMain)
//        btnShowToast = findViewById(R.id.btnShowToast)
//        btnShowSnackbar = findViewById(R.id.btnShowSnackbar)
//
//        btnShowToast.setOnClickListener{
//            Toast.makeText(applicationContext, "Ini adalah pesan Toast.", Toast.LENGTH_LONG).show()
//        }
//
//        btnShowSnackbar.setOnClickListener{
//            Snackbar.make(llMain, "Ini adalah pesan Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Tutup", View.OnClickListener { }).show()
//        }
//
//    }
//
//}