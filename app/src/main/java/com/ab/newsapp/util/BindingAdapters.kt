package com.ab.newsapp.util

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.ab.newsapp.R
import com.bumptech.glide.Glide

class BindingAdapters {

    //    here we create our custom binding adapter like so
    companion object {
        @JvmStatic @BindingAdapter("glide_url")
        fun loadImg(imageView: ImageView, url: String?) {
            // we will  use glide library to load the image from a url
            Glide.with(imageView.context).load(url).into(imageView)
            // now let's use this adapter in our xml file
        }

        @JvmStatic @BindingAdapter("glide_circular")
        fun loadUserImg(view: ImageView, url: String?) {

            // glide can make any image in a circular format with ease
            Glide.with(view.context).load(url).circleCrop().into(view)
        }

        @JvmStatic @BindingAdapter("set_background")
        fun setBackground(view: ImageView, color: String?) {
            when (color) {
                "RED" -> view.setBackgroundColor(view.context.resources.getColor(R.color.colorPrimary))
                "BLACK" -> view.setBackgroundColor(view.context.resources.getColor(R.color.black))
                "YELLOW" -> view.setBackgroundColor(view.context.resources.getColor(R.color.dark_icon_tint_color))
                "BLUE" -> view.setBackgroundColor(view.context.resources.getColor(R.color.purple_500))
                "PURPLE" -> view.setBackgroundColor(view.context.resources.getColor(R.color.colorPrimaryDark))
                else -> view.setBackgroundColor(view.context.resources.getColor(R.color.light_bg_color))
            }
        }

        @JvmStatic @BindingAdapter("set_checked")
        fun toggleFav(view: ImageView, isFav: Boolean) {
            if (isFav) {
                view.setColorFilter(ContextCompat.getColor(view.context, R.color.light_bg_color))
            } else view.setColorFilter(
                ContextCompat.getColor(
                    view.context,
                    R.color.dark_icon_tint_color
                )
            )
        }
    }
}