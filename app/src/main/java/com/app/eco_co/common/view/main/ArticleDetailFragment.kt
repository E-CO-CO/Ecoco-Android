package com.app.eco_co.common.view.main

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.app.eco_co.R
import com.app.eco_co.common.util.BaseFragment
import com.app.eco_co.common.view.custom.CustomToast.showCustomToast
import com.app.eco_co.databinding.FragmentArticleDetailBinding


class ArticleDetailFragment :
    BaseFragment<FragmentArticleDetailBinding>(FragmentArticleDetailBinding::inflate) {
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    } // End of onAttach()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initEventListeners()
    } // End of onViewCreated()

    private fun initEventListeners() {
        binding.ivArticleDetailArrow.setOnClickListener {
            Navigation.findNavController(binding.ivArticleDetailArrow).popBackStack()
        }

        binding.ivArticleDetailBookmark.setOnClickListener {
            mContext.showCustomToast(mContext.getString(R.string.content_article_bookmark_add))
        }
    } // End of initEventListeners()
} // End of ArticleDetailFragment class
