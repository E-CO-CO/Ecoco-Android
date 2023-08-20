package com.app.eco_co.common.view.start

import android.content.Context
import android.os.Bundle
import android.view.View
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

        initEventListeners()
    } // End of onViewCreated()

    private fun initEventListeners() {
        binding.btnKakaoLogin.setOnClickListener {
            Navigation.findNavController(binding.btnKakaoLogin)
                .navigate(R.id.action_startFragment_to_userInformInputFragment)
        }

    } // End of initEventListeners

} // End of StartFragment class