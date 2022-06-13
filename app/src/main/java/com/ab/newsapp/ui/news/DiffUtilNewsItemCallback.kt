package com.ab.newsapp.ui.news

import androidx.recyclerview.widget.DiffUtil
import com.ab.newsapp.data.NewsItem

class DiffUtilNewsItemCallback() : DiffUtil.ItemCallback<NewsItem>() {
    override fun areItemsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.id == newItem.id
    }
}