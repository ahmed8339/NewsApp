package com.ab.newsapp.ui.news

import com.ab.newsapp.data.NewsItem
import com.ab.newsapp.databinding.ItemNewsImageBinding
import com.ab.newsapp.databinding.ItemNewsTextBinding

class ImageViewHolder(var itemNewsIB: ItemNewsImageBinding) : BaseViewHolder(
    itemNewsIB.root
) {

    override fun bindData(item: NewsItem) {
        itemNewsIB.newsItemImage = item
    }

    override fun getItemNewsTextBinding(): ItemNewsTextBinding? {
        return null
    }

    override fun getItemNewsImageBinding(): ItemNewsImageBinding? {
        return null
    }
}