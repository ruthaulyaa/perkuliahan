package com.example.pampraktikum6_11s20018

import android.os.Bundle
import androidx. fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    // Inflate the layout for this fragment
    return inflater.inflate(R.layout. fragment_first,
        container, false)
    }
}