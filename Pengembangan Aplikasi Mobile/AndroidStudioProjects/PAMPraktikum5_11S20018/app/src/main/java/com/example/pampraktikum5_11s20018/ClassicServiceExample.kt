package com.example.pampraktikum5_11s20018

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service", "Classic Service is created.")
    }

    override fun onStartCommand(
        intent: Intent?, flags: Int, startid: Int
    ): Int {
        Log.d("Service", "Classic Service is started.")
        Log.d("Service Thread", Thread.currentThread().name)
        return super.onStartCommand(intent, flags, startid)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Classic Service is stopped.")
    }

}