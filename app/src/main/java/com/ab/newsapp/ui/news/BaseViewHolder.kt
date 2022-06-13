package com.ab.newsapp.ui.news

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ab.newsapp.data.NewsItem
import com.ab.newsapp.databinding.ItemNewsImageBinding
import com.ab.newsapp.databinding.ItemNewsTextBinding

abstract class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    abstract fun bindData(item: NewsItem)
    abstract fun getItemNewsTextBinding(): ItemNewsTextBinding?
    abstract fun getItemNewsImageBinding(): ItemNewsImageBinding?
}