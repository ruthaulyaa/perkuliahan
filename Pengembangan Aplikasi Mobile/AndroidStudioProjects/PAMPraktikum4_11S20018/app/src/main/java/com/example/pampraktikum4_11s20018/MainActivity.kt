package com.example.pampraktikum4_11s20018

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var llMain: LinearLayout
    lateinit var btnShowToast: Button
    lateinit var btnShowSnackbar: Button
    lateinit var btnShowDialog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llMain = findViewById(R.id.llMain)
        btnShowToast = findViewById(R.id.btnShowToast)
        btnShowSnackbar = findViewById(R.id.btnShowSnackbar)
        btnShowDialog = findViewById(R.id.btnShowDialog)

        btnShowToast.setOnClickListener{
            Toast.makeText(applicationContext, "Ini adalah pesan Toast.", Toast.LENGTH_LONG).show()
        }

        btnShowSnackbar.setOnClickListener{
            Snackbar.make(llMain, "Ini adalah pesan Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Tutup", View.OnClickListener { }).show()
        }

        btnShowDialog.setOnClickListener{
            showAllertDialog()
        }
    }

    fun showAllertDialog(){
        var alertDialog = AlertDialog.Builder(this@MainActivity)

        alertDialog.setTitle("Ubah Tulisan Tombol").setMessage("Apakah kamu ingin mengubah tulisan pada tombol?").setIcon(R.drawable.warning).setCancelable(false).setNegativeButton("Batal",DialogInterface.OnClickListener{ dialog, which -> dialog.cancel()}).setPositiveButton("Ya", DialogInterface.OnClickListener{dialog, which -> btnShowDialog.text = "Kamu Mengubah tulisan"})

        alertDialog.create().show()
    }

}