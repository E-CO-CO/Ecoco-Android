package com.app.eco_co.common.view.custom

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.app.eco_co.databinding.CustomToastBinding


private const val TAG = "ToastMessageCustomView_창영"

object CustomToast {
    lateinit var binding: CustomToastBinding

    fun Context.showCustomToast(message: String) {
        // Inflate the custom toast layout
        val inflater = LayoutInflater.from(this)
        binding = CustomToastBinding.inflate(inflater)

        // Set the message text
        binding.tvCustomToastMessage.text = message

        // Change the layout width to MATCH_PARENT
        val layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        binding.root.layoutParams = layoutParams

        // Create and show the Toast
        val toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, 0, 30)
        toast.setMargin(0.5f, 0.0f)

        toast.duration = Toast.LENGTH_SHORT
        toast.view = binding.root // Attach the custom layout to the Toast
        toast.show()
    } // End of showCustomToast()
} // End of CustomToast object
