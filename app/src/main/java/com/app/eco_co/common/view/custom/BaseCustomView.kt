package com.app.eco_co.common.view.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewbinding.ViewBinding


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

private const val TAG = "BaseCustomView_창영"

abstract class BaseCustomView<VB : ViewBinding> @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    inflate: Inflate<VB>
) : ConstraintLayout(context, attrs) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as? LayoutInflater
            ?: throw IllegalStateException("LayoutInflater not found.")

        val view = inflate.invoke(inflater, this as ViewGroup, false)
        addView(view.root)
    } // End of init()


} // End of BaseCustomView