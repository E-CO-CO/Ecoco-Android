package com.app.eco_co.common.view.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.app.eco_co.R
import com.app.eco_co.databinding.ItemValidateListBinding
import com.app.eco_co.domain.entity.Validate
import com.bumptech.glide.Glide


private const val TAG = "ValidateAdapter_창영"

class ValidateAdapter(
    val context: Context,
    private val validateList: List<Validate>
) : RecyclerView.Adapter<ValidateAdapter.ValidateHolder>() {
    private lateinit var binding: ItemValidateListBinding

    inner class ValidateHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindInfo(data: Validate) {
            binding.apply {
                when (data.validateTag) {
                    true -> {
                        tvItemValidateTag.text = "인증완료"
                    }
                    else -> {
                        tvItemValidateTag.text = "실패"
                        clItemValidate.background =
                            ContextCompat.getDrawable(context, R.drawable.bg_rect_gainsboro_radius6)
                        clItemValidateTag.background =
                            ContextCompat.getDrawable(context, R.drawable.bg_rect_dim_gray_radius24)
                    }
                }

                tvItemValidate.text = data.challengeeName
                Glide.with(itemView.context).load(data.img).into(ivItemValidate)
            }

        } // End of bindInfo()
    } // End of ValidateHolder inner class

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ValidateHolder {
        binding =
            ItemValidateListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ValidateHolder(binding.root)
    } // End of onCreateViewHolder()

    override fun getItemCount() = validateList.size

    override fun onBindViewHolder(holder: ValidateHolder, position: Int) {
        holder.bindInfo(validateList[position])

    } // End of onBindViewHolder()
} // End of ValidateAdapter class
