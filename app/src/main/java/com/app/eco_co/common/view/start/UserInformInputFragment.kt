package com.app.eco_co.common.view.start

import android.content.Context
import android.os.Bundle
import android.view.View
import com.app.eco_co.common.util.BaseFragment
import com.app.eco_co.common.view.custom.NextGreenButtonCustomView
import com.app.eco_co.databinding.FragmentUserInformInputBinding

private const val TAG = "UserInformInputFragment_창영"

class UserInformInputFragment :
    BaseFragment<FragmentUserInformInputBinding>(FragmentUserInformInputBinding::inflate) {
    private lateinit var mContext: Context
    private lateinit var nextGreenButton: NextGreenButtonCustomView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    } // End of onAttach()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextGreenButton = binding.btnUserInformInputNext
        nextGreenButton.setView(1)


    } // End of onViewCreated
} // End of UserInformInputFragment class
