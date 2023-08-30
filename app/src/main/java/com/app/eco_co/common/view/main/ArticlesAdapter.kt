package com.app.eco_co.common.view.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.eco_co.databinding.ArticleListItemBinding
import com.app.eco_co.domain.entity.Article
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropSquareTransformation


private const val TAG = "ArticlesAdapter_창영"

class ArticlesAdapter(val context: Context, private val articleList: List<Article>) :
    RecyclerView.Adapter<ArticlesAdapter.ArticleHolder>() {
    private lateinit var binding: ArticleListItemBinding
    private lateinit var picasso: Picasso

    private lateinit var itemClickListener: ItemClickListener

    inner class ArticleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindInfo(data: Article) {
            binding.tvArticleTag.text = data.tag
            binding.tvArticleMainTitle.text = data.mainTitle
            binding.tvArticleSubTitle.text = data.subTitle

//            picasso.load(data.thumbnail).transform(CropSquareTransformation())
//                .into(binding.ivArticleThumbnail)

            picasso.load(data.userImage).transform(CropSquareTransformation())
                .into(binding.ivUserImage)

            binding.ivArticleThumbnail.setBackgroundResource(data.thumbnail.toString().toInt())
            binding.ivArticleThumbnail.scaleType = ImageView.ScaleType.CENTER_CROP
        }
    } // End of ArticleHolder inner class

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        binding = ArticleListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleHolder(binding.root)
    } // End of onCreateViewHolder()

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        picasso = Picasso.get()

        holder.bindInfo(articleList[position])

        binding.clArticleDetail.setOnClickListener {
            itemClickListener.onArticleClick(position)
        }
    } // End of onBindViewHolder()

    interface ItemClickListener {
        fun onArticleClick(position: Int)
    } // End of ItemClickListener

    fun setItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    } // End of setItemClickListener

    override fun getItemCount() = articleList.size
} // End of ArticlesAdapter class
