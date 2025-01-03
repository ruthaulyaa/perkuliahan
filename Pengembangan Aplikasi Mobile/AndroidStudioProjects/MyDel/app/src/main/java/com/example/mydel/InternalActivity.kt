package com.example.mydel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.mydel.databinding.ActivityInternalBinding

class InternalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInternalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInternalBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backInternal.setOnClickListener{
            val intent = Intent(this@InternalActivity, HomeFragment::class.java)
            startActivity(intent)
          }

        }
}