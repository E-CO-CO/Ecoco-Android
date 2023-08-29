package com.app.eco_co.common.view.custom

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import com.app.eco_co.R
import com.app.eco_co.databinding.NextGreenButtonBinding

private const val TAG = "NextGreenButtonCustomView_창영"

class NextGreenButtonCustomView(
    context: Context, attrs: AttributeSet
) : BaseCustomView<NextGreenButtonBinding>(
    context, attrs, NextGreenButtonBinding::inflate
) {
    private var tvStart: TextView? = null

    init {
        tvStart = binding.tvStart
    }


    fun setView(option: Int) {
        when (option) {
            1 -> {
                tvStart!!.setText(R.string.content_start)
            }
        }
    } // End of setView()
} // End of NextGreenButtonCustomView class
