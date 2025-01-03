//package com.example.pampraktikum5_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.ListView
//import android.widget.Toast
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var ivAsean : ListView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ivAsean = findViewById(R.id.ivAsean)
//
//        var aseanList = resources.getStringArray(R.array.asean)
//        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, aseanList)
//
//        ivAsean.adapter = arrayAdapter
//        ivAsean.setOnItemClickListener{parent, view, position, id ->
//            val countryName: String = parent.getItemAtPosition(position).toString()
//            Toast.makeText(applicationContext, "Kamu memilih negara ${countryName}", Toast.LENGTH_SHORT).show()
//
//        }
//
//    }
//}