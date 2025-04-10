package com.example.pampraktikum5_11s20018

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i ("fragment", "onAttach")
    }

    override fun onCreate(savedinstanceState: Bundle?) {
        super.onCreate(savedinstanceState)
        Log.i ("fragment", "onCreate")
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedinstanceState: Bundle?): View? {
            Log.i("fragment", "onCreateView")
            return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedinstanceState: Bundle?) {
        super.onViewCreated(view, savedinstanceState)
        Log.i("fragment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i( "fragment", "onStart" )
    }

    override fun onResume() {
        super.onResume()
        Log.i("fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("fragment", "onStop ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("fragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("fragment", "onDetach")
    }

}