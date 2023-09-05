package com.app.eco_co.common.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.app.eco_co.R
import com.bumptech.glide.Glide

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("circleImgUri")
    fun ImageView.setProfileImg(imgUri: String?) {
        Glide.with(this.context)
            .load(imgUri)
            .placeholder(R.drawable.ic_profile_default)
            .error(R.drawable.ic_profile_default)
            .circleCrop()
            .into(this)
    }
}