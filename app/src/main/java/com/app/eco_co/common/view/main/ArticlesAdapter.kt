package com.app.eco_co.common.view.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.eco_co.databinding.ItemArticleListBinding
import com.app.eco_co.domain.entity.Article
import com.bumptech.glide.Glide


private const val TAG = "ArticlesAdapter_창영"

class ArticlesAdapter(
    val context: Context,
    private val articleList: List<Article>,
    private var onArticleClickListener: (Int, String) -> Unit
) :
    RecyclerView.Adapter<ArticlesAdapter.ArticleHolder>() {
    private lateinit var binding: ItemArticleListBinding

    inner class ArticleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindInfo(data: Article) {
            binding.apply {
                tvArticleTag.text = data.tag
                tvArticleMainTitle.text = data.mainTitle
                tvArticleSubTitle.text = data.subTitle

                Glide.with(itemView.context).load(data.userImage).into(ivUserImage)

                ivArticleThumbnail.setBackgroundResource(data.thumbnail.toString().toInt())
                ivArticleThumbnail.scaleType = ImageView.ScaleType.CENTER_CROP
            }
        }
    } // End of ArticleHolder inner class

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        binding = ItemArticleListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleHolder(binding.root)
    } // End of onCreateViewHolder()

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        holder.bindInfo(articleList[position])

        binding.clArticleDetail.setOnClickListener {
            onArticleClickListener.invoke(position, "")
        }
    } // End of onBindViewHolder()

    override fun getItemCount() = articleList.size
} // End of ArticlesAdapter class
