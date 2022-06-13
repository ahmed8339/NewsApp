package com.ab.newsapp.data

data class NewsItem(
    val id: Int,
    val title:String,
    val userName: String,
    val newsImg: String,
    val userImage: String,
    val content: String,
    val bgColor: String,
    val dateCreation: Long?,
    val viewType:Int = 0,
    val videoUrl: String,
    val isFav: Boolean = false

)
