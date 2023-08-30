package com.app.eco_co.common.view.custom

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.app.eco_co.R


private const val TAG = "ToastMessageCustomView_창영"
fun Context.showCustomToast(message: String) {
    // Inflate the custom toast layout
    val inflater = LayoutInflater.from(this)
    val layout: View = inflater.inflate(R.layout.custom_toast, null)

    // Get the TextView from the custom layout and update its text
    val textView: TextView = layout.findViewById(R.id.tv_custom_toast_message)
    textView.text = message

    Log.d(TAG, "showCustomToast: $message ")

    // Create and show the Toast
    val toast = Toast(this)
    toast.duration = Toast.LENGTH_SHORT
    toast.view = layout // Attach the custom layout to the Toast
    toast.show()
}
