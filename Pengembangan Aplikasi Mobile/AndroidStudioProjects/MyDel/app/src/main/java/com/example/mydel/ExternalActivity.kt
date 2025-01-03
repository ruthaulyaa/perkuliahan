package com.example.mydel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar


class ExternalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_external)

        supportActionBar?.apply {
            // Aktifkan tombol kembali
            setDisplayHomeAsUpEnabled(true)
        }
    }
}