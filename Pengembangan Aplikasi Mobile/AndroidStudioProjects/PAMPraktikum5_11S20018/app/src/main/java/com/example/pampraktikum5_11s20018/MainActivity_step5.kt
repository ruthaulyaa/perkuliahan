//package com.example.pampraktikum5_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.webkit.WebView
//import android.webkit.WebViewClient
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var wvApp: WebView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        wvApp = findViewById(R.id.wvApp)
//        wvApp.webViewClient = WebViewClient()
//        wvApp.loadUrl("https://delcom.org")
//
//    }
//
//    override fun onBackPressed() {
//        if (wvApp.canGoBack()) {
//            wvApp.goBack()
//        } else {
//            super.onBackPressed()
//        }
//    }
//}