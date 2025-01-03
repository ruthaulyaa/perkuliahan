package com.example.pampraktikum9_11s20018

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Receiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val messageText = intent?.getStringExtra("toast")

        Toast.makeText(context, messageText, Toast.LENGTH_LONG).show()
    }
}