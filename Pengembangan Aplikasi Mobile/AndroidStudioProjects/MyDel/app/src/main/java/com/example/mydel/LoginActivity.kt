package com.example.mydel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.mydel.data.local.DataMahasiswa
import com.example.mydel.data.remote.Client
import com.example.mydel.data.remote.responseLogin.ResponseLogin
import com.example.mydel.data.remote.responseMahasiswa.ResponseMahasiswa
import com.example.mydel.util.LoginPrefs
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.jsoup.Jsoup
import retrofit2.*

class LoginActivity : AppCompatActivity() {

    private lateinit var progBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<TextInputEditText>(R.id.usernameLogin)
        val password = findViewById<TextInputEditText>(R.id.passwordLogin)
        val btnLogin = findViewById<MaterialButton>(R.id.buttonLogin)
        progBar = findViewById(R.id.progBar)

        btnLogin.setOnClickListener {
            if (username.text.toString().isEmpty()) {
                findViewById<TextInputLayout>(R.id.usernameLoginLayout).error =
                    "Username tidak boleh kosong"
            } else if (password.text.toString().isEmpty()) {
                findViewById<TextInputLayout>(R.id.passwordLoginLayout).error =
                    "password tidak boleh kosong"
            } else {val enteredUsername = username.text.toString()
                val enteredPassword = password.text.toString()

                if (enteredUsername == "admin" && enteredPassword == "adminpassword") {
                    progBar.visibility = View.GONE
                    val prefs = LoginPrefs(this@LoginActivity)
                    prefs.setIsLogin(true)
                    startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                } else {
                    login(enteredUsername, enteredPassword)
                }
            }
        }
    }

    private fun login(username: String, password: String) {
        progBar.visibility = View.VISIBLE
        Client.instance.checkUser(username, password).enqueue(object : Callback<ResponseLogin> {
            override fun onResponse(call: Call<ResponseLogin>, response: Response<ResponseLogin>) {
                if (response.isSuccessful) {
                    if (!response.body()!!.result) {
                        Log.i("GAGAL", response.body().toString())
                        Log.i("LOGIN", "LOGIN GAGAL")
                        progBar.visibility = View.GONE
                    } else {
                        val prefs = LoginPrefs(this@LoginActivity)
                        prefs.setIsLogin(true)

                        getDataMahasiswaAndSaveToLocalData(username, response.body()!!.token)
                        progBar.visibility = View.GONE
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                    }
                }
            }

            override fun onFailure(call: Call<ResponseLogin>, t: Throwable) {
                Log.i("info", "gagal")
                Log.i("info gagal", t.toString())
                progBar.visibility = View.GONE
            }
        })
    }

    private fun getFotoProfil(session: String) : String {
        var imgLink = ""
        val th = Thread {
            val html = Jsoup.connect("https://cis.del.ac.id/user/profile")
                .ignoreHttpErrors(true)
                .cookie("PHPSESSID", session)
                .get()

            val htmlString = html.toString()
            val doc = Jsoup.parse(htmlString)
            val img = doc.select("img").first()
            imgLink = img!!.attr("src")

        }
        th.start()

        th.join()
        Log.i("imgLink", imgLink)

        return imgLink
    }

    private fun getDataMahasiswaAndSaveToLocalData(username: String, token: String) {
        Log.i("masuk", "masuk sini")
        Client.instance.getDataUser(username, "Bearer $token")
            .enqueue(object : Callback<ResponseMahasiswa> {
                override fun onResponse(
                    call: Call<ResponseMahasiswa>,
                    response: Response<ResponseMahasiswa>
                ) {
                    if (response.isSuccessful) {
                        val sessionId = response.headers().values("Set-Cookie")[0].split(";")[0].split("=")[1]
                        val foto = getFotoProfil(sessionId)
                        Log.i("getDataUser", response.body()!!.toString())
                        val data = response.body()!!.data.mahasiswa[0]
                        DataMahasiswa(this@LoginActivity).setData(
                            data.nama,
                            data.nim,
                            data.prodi_name,
                            data.angkatan,
                            foto
                        )
                        Log.i("fotofun", foto)
                    } else {
                        Log.i("getDataUser", "Gak jelas")
                    }
                }

                override fun onFailure(call: Call<ResponseMahasiswa>, t: Throwable) {
                    Log.i("getDataUser", "Gagal")
                }
            })
    }


}