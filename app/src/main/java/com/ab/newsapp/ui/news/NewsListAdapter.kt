package com.ab.newsapp.ui.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.ab.newsapp.R
import com.ab.newsapp.data.NewsItem
import com.ab.newsapp.databinding.ItemNewsImageBinding
import com.ab.newsapp.databinding.ItemNewsTextBinding

class NewsListAdapter(diffCallback: DiffUtilNewsItemCallback) :
    ListAdapter<NewsItem, BaseViewHolder>(diffCallback) {

    private var listener: NewsListAdapter.OnNewsItemClickEvent? = null

    interface OnNewsItemClickEvent {
        fun onItemTextClick()
        fun onItemImageClick()
        fun onItemLongClick()
    }

    fun setOnNewsItemClickListener(listener: OnNewsItemClickEvent?) {
        this.listener = listener
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position)!!.viewType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

        // based on the item viewtype we create our viewholder
        // we have two viewhodler for now : text view holder and image view holder
        // and don't forgot that we are going to use data Binding feature to bind our data in the viewholder class
        // we need to configure our viewholders so they can accept a binding layout like so ...
        // now we can instantiate our viewholders safely
        return when (viewType) {
            VIEWTYPE_NEWS_TEXT -> {
                val itemNewsTextBinding =
                    DataBindingUtil.inflate<ItemNewsTextBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_news_text, parent, false
                    )
                TextViewHolder(itemNewsTextBinding)
            }
            VIEWTYPE_NEWS_IMAGE -> {
                val itemNewsImageBinding =
                    DataBindingUtil.inflate<ItemNewsImageBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_news_image, parent, false
                    )
                ImageViewHolder(itemNewsImageBinding)
            }
            else -> {
                val defaultItemNewsTextBinding =
                    DataBindingUtil.inflate<ItemNewsTextBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_news_text, parent, false
                    )
                TextViewHolder(defaultItemNewsTextBinding)
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        getItem(position)?.let { holder.bindData(it) }
    }

    companion object {
        const val VIEWTYPE_NEWS_TEXT = 0
        const val VIEWTYPE_NEWS_IMAGE = 1
        const val VIEWTYPE_NEWS_VIDEO = 2
    }
}