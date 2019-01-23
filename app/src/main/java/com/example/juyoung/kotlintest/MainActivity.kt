package com.example.juyoung.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.example.juyoung.kotlintest.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a: Int = 10
    var adapter: MainRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVIew()
    }


    fun initVIew() {
        recyclerview_main_movie.layoutManager = LinearLayoutManager(this)
        recyclerview_main_movie.setHasFixedSize(true)
        adapter = MainRecyclerViewAdapter()
        recyclerview_main_movie.adapter = adapter
        button_main_search.setOnClickListener {
            var searchText = edittext_main_search.text.toString()
            if (searchText.isEmpty()) {
                Toast.makeText(it.context, "검색어를 입력하세요", Toast.LENGTH_SHORT).show()
            } else {
                var list=ArrayList<Movie>()
                for(i in 1..10){
                    list.add(Movie("테스트"+i))
                }
                adapter?.setItemList(list)
            }
        }
    }
}
