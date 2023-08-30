package com.app.eco_co.common.view.main

import android.content.Context
import android.os.Bundle
import android.view.View
import com.app.eco_co.common.util.BaseFragment
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
    }

} // End of ArticleDetailFragment class
