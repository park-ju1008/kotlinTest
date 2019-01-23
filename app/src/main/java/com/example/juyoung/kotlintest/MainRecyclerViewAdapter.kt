package com.example.juyoung.kotlintest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.juyoung.kotlintest.model.Movie
import kotlinx.android.synthetic.main.item_main.view.*

class MainRecyclerViewAdapter() : RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>() {
    private var itemList: ArrayList<Movie> = ArrayList<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setItemList(moives:List<Movie>){
        itemList.addAll(moives)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie) {
            with(movie) {
                itemView.textview_item_title.text = title
                itemView.textview_item_actor.text = actor
                itemView.textview_item_director.text = director
                itemView.textview_item_pubdate.text = pubDate
            }
        }
    }
}