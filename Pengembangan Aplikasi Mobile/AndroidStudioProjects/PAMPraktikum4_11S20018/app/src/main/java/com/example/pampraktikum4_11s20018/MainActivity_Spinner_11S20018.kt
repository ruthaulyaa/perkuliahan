//package com.example.pampraktikum4_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
//
//    lateinit var tvResult: TextView
//    lateinit var spnTempatWisata: Spinner
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        tvResult = findViewById(R.id.tvResult)
//        spnTempatWisata = findViewById(R.id.spnTempatWisata)
//
//        spnTempatWisata.onItemSelectedListener = this
//
//        var arrayAdapter = ArrayAdapter.createFromResource(this, R.array.tempat_wisata, android.R.layout.simple_spinner_item)
//
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spnTempatWisata.adapter = arrayAdapter
//
//    }
//
//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        tvResult.text = "Tempat wisata yang ingin dituju\n${parent!!.getItemAtPosition(position).toString()}"
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>?) {
//        TODO("Not yet implemented")
//    }
//
//}