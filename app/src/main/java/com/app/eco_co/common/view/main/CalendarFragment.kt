package com.app.eco_co.common.view.main

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.eco_co.R
import com.app.eco_co.common.util.BaseFragment
import com.app.eco_co.databinding.FragmentCalendarBinding
import com.app.eco_co.domain.entity.Validate


class CalendarFragment : BaseFragment<FragmentCalendarBinding>(FragmentCalendarBinding::inflate) {
    private lateinit var mContext: Context
    private lateinit var validatesAdapter: ValidateAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    } // End of onAttach()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    } // End of onViewCreated()

    private fun initAdapter() {
        validatesAdapter = ValidateAdapter(mContext, validateList)

        binding.rvCanlendar.apply {
            adapter = validatesAdapter
            layoutManager = LinearLayoutManager(mContext, GridLayoutManager.VERTICAL, false)
        }
    } // End of initAdapter()

    companion object {
        var validateList = arrayListOf<Validate>(
            Validate(R.drawable.bg_user_image_default.toString(), true, "분리수거하기"),
            Validate(R.drawable.bg_user_image_default.toString(), false, "분리수거하기"),

            )
    }

} // End of CalendarFragment class