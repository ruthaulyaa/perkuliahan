//package com.example.pampraktikum9_11s20018
//
//import android.content.Intent
//import android.content.pm.PackageManager
//import android.net.Uri
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import androidx.core.app.ActivityCompat
//import androidx.core.content.ContextCompat
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var etPhone: EditText
//    lateinit var btnCall: Button
//
//    var userNumber : String = ""
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        etPhone = findViewById(R.id.etPhone)
//        btnCall = findViewById(R.id.btnCall)
//
//        btnCall.setOnClickListener {
//            val userNumber = etPhone.text.toString()
//            startCall(userNumber)
//        }
//    }
//
//    fun sendEmail( userAddress: String, userSubject: String, userMessage : String){
//
//        val emailAddress = arrayOf(userAddress)
//        val emailIntent = Intent(Intent.ACTION_SENDTO)
//        emailIntent.data = Uri.parse("mailto:")
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, emailAddress)
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, userSubject)
//        emailIntent.putExtra(Intent.EXTRA_TEXT, userMessage)
//
//        if(emailIntent.resolveActivity (packageManager) != null) {
//            startActivity(Intent.createChooser (emailIntent, "Choose an app"))
//        }
//    }
//}