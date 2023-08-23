package com.app.eco_co.common.view.start

import android.content.Context
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation
import com.app.eco_co.R
import com.app.eco_co.common.util.BaseFragment
import com.app.eco_co.databinding.FragmentStartBinding


class StartFragment : BaseFragment<FragmentStartBinding>(FragmentStartBinding::inflate) {
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    } // End of onAttach()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()

        initEventListeners()
    } // End of onViewCreated()

    private fun initUI() {
        // 에코를 함께하다 에서 함께 색상변경
        val withEcoWithSpannable = SpannableStringBuilder(binding.tvEcocoSlogan.text)
        val withEcoWithColor = ForegroundColorSpan(
            ContextCompat.getColor(
                mContext, R.color.tv_ecoco_slogan_with_color
            )
        )
        withEcoWithSpannable.setSpan(withEcoWithColor, 4, 6, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        binding.tvEcocoSlogan.text = withEcoWithSpannable

        // ECOCO에서 CO 색상 변경
        val ecocoNameCoSpannable = SpannableStringBuilder(binding.tvEcocoName.text)
        val ecocoNameCoColor = ForegroundColorSpan(
            ContextCompat.getColor(
                mContext, R.color.tv_ecoco_name_co_color
            )
        )
        ecocoNameCoSpannable.setSpan(ecocoNameCoColor, 3, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        binding.tvEcocoName.text = ecocoNameCoSpannable
    } // End of initUI

    private fun initEventListeners() {
        binding.btnKakaoLogin.setOnClickListener {
            Navigation.findNavController(binding.btnKakaoLogin)
                .navigate(R.id.action_startFragment_to_userInformInputFragment)
        }
    } // End of initEventListeners
} // End of StartFragment class
