//package com.example.pampraktikum_11s20018
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.Toast
//import androidx.core.view.isVisible
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.pampraktikum_11s20018.databinding.ActivityMainBinding
//import retrofit2.*
//import retrofit2.converter.gson.GsonConverterFactory
//
//class MainActivity: AppCompatActivity() {
//
//    private val baseURL = "https://jsonplaceholder.typicode.com/"
//
//    lateinit var mainBinding: ActivityMainBinding
//
//    var postList = ArrayList<Post>()
//
//    lateinit var adapter: PostAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        mainBinding = ActivityMainBinding.inflate(layoutInflater)
//        super.onCreate(savedInstanceState)
//        val view = mainBinding.root
//        setContentView(view)
//        showPosts()
//    }
//
//    fun showPosts() {
//        val retofit =
//            Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create())
//                .build()
//        val retrofitAPI: RetrofitAPI = retofit.create(RetrofitAPI::class.java)
//        val call: Call<List<Post>> = retrofitAPI.getAllPosts()
//
//        call.enqueue(object : Callback<List<Post>> {
//            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
//                if (response.isSuccessful) {
//                    mainBinding.pbPosts.visibility = View.INVISIBLE
//                    mainBinding.rvPosts.visibility = View.VISIBLE
//                    mainBinding.rvPosts.isVisible = true
//                    postList = response.body() as ArrayList<Post>
//                    adapter = PostAdapter(postList)
//                    mainBinding.rvPosts.layoutManager = LinearLayoutManager(this@MainActivity)
//                    mainBinding.rvPosts.adapter = adapter
//                }
//            }
//
//            override fun onFailure(
//                call: Call<List<Post>>, t: Throwable
//            ) {
//                Toast.makeText(
//                    applicationContext,
//                    t.localizedMessage,
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        })
//    }
//}