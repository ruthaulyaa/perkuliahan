package com.example.mydel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mydel.util.LoginPrefs
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navController = findNavController(R.id.nav_host_fragment)
        bottomNavigationView.setupWithNavController(navController)

        bottomNavigationView.setOnItemSelectedListener {
            val prefs = LoginPrefs(this)
            if (!prefs.getIsLogin()) {
                Log.i("LOGIN", "ENGGAK LOGIN")
                startActivity(Intent(this, LoginActivity::class.java))
            } else {
                navController.navigate(it.itemId)
            }



            return@setOnItemSelectedListener true
        }
    }


}
