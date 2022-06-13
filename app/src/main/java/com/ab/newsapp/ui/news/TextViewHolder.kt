package com.ab.newsapp.ui.news

import com.ab.newsapp.data.NewsItem
import com.ab.newsapp.databinding.ItemNewsImageBinding
import com.ab.newsapp.databinding.ItemNewsTextBinding

class TextViewHolder(var itemNewsTB: ItemNewsTextBinding) : BaseViewHolder(
    itemNewsTB.root
) {

    override fun bindData(item: NewsItem) {
        itemNewsTB.newsItemText = item
    }

    override fun getItemNewsTextBinding(): ItemNewsTextBinding? {
        return null
    }

    override fun getItemNewsImageBinding(): ItemNewsImageBinding? {
        return null
    }
}