package com.example.mydel.data.local

import android.content.Context
import android.content.SharedPreferences

class DataMahasiswa(context: Context) {

    private var spNama: SharedPreferences? = null
    private var spNIM: SharedPreferences? = null
    private var spProdi: SharedPreferences? = null
    private var spAngkatan: SharedPreferences? = null
    private var spFoto: SharedPreferences? = null

    init {
        spNama = context.getSharedPreferences("nama", Context.MODE_PRIVATE)
        spNIM = context.getSharedPreferences("nim", Context.MODE_PRIVATE)
        spProdi = context.getSharedPreferences("prodi", Context.MODE_PRIVATE)
        spAngkatan = context.getSharedPreferences("angkatan", Context.MODE_PRIVATE)
        spFoto = context.getSharedPreferences("foto", Context.MODE_PRIVATE)
    }

    fun setData(nama: String, nim: String, prodi: String, angkatan: Int, foto: String) {
        spNama!!.edit().putString("nama", nama).apply()
        spNIM!!.edit().putString("nim", nim).apply()
        spProdi!!.edit().putString("prodi", prodi).apply()
        spAngkatan!!.edit().putString("angkatan", angkatan.toString()).apply()
        spFoto!!.edit().putString("foto", foto).apply()
    }

    fun getNama() : String {
        return spNama?.getString("nama", "")!!
    }

    fun getNIM() : String {
        return spNIM?.getString("nim", "")!!
    }

    fun getProdi() : String {
        return spProdi?.getString("prodi", "")!!
    }

    fun getAngkatan() : String {
        return spAngkatan?.getString("angkatan", "")!!
    }

    fun getFoto() : String {
        return spFoto?.getString("foto", "")!!
    }
}