package com.example.mydel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.content.Intent
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings

class MenuFragment : Fragment() {
    private lateinit var btnExternal: Button
    private lateinit var btnInternal: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Perform any necessary initialization here'

        btnExternal = view.findViewById(R.id.BtnExternal)
        btnInternal = view.findViewById(R.id.BtnInternal)


        btnInternal.setOnClickListener {
            val intent = Intent(activity, InternalActivity::class.java)
            startActivity(intent)
        }

        btnExternal.setOnClickListener{
            val intent = Intent(activity,ExternalActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

}
