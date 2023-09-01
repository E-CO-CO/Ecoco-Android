package com.app.eco_co.common.view.main

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.eco_co.R
import com.app.eco_co.common.util.BaseFragment
import com.app.eco_co.common.view.custom.CustomToast.showCustomToast
import com.app.eco_co.databinding.FragmentArticleHomeBinding
import com.app.eco_co.domain.entity.Article
import java.time.LocalDate


private const val TAG = "ArticleHomeFragment_창영"

class ArticleHomeFragment :
    BaseFragment<FragmentArticleHomeBinding>(FragmentArticleHomeBinding::inflate) {
    private lateinit var mContext: Context
    private lateinit var articlesAdapter: ArticlesAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    } // End of onAttach()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    } // End of onViewCreated()

    private fun initAdapter() {
        articlesAdapter = ArticlesAdapter(mContext, articleTestList)

        binding.rvArticles.apply {
            adapter = articlesAdapter
            layoutManager = LinearLayoutManager(mContext, GridLayoutManager.VERTICAL, false)
        }

        articlesAdapter.setItemClickListener(object : ArticlesAdapter.ItemClickListener {
            override fun onArticleClick(position: Int) {
                mContext.showCustomToast("${position + 1} 번째 아티클 클릭!")

                Navigation.findNavController(binding.rvArticles.findViewById(R.id.cl_article_detail))
                    .navigate(R.id.action_articleHomeFragment_to_articleDetailFragment)
            }
        })
    } // End of initAdapter()

    companion object {
        var articleTestList = arrayListOf(
            Article(
                1,
                "생활꿀팁",
                "텁블러 효과적으로 쓰는 법",
                "매일 쓰는 텀블러, 더 효과적으로",
                userImage = R.drawable.bg_user_image_default.toString(),
                thumbnail = R.drawable.img_article_test1.toString(),
                "에코코",
                LocalDate.now(),
                content = "내용이 들어감",
                arrayListOf("", "")
            ),
            Article(
                2,
                "생활꿀팁",
                "지금 북극은",
                "당신이 모르는 사이에 북극은 변하고 있다.",
                R.drawable.bg_user_image_default.toString(),
                R.drawable.img_article_test2.toString(),
                "에코코",
                LocalDate.now(),
                content = "내용이 들어감",
                arrayListOf("", "")
            ),
            Article(
                3,
                "생활꿀팁",
                "어떤 컵이 좋을까?",
                "컵의 재질도 환경에 영향을 줄 수 있다.",
                R.drawable.bg_user_image_default.toString(),
                R.drawable.img_article_test3.toString(),
                "에코코",
                LocalDate.now(),
                content = "내용이 들어감",
                arrayListOf("", "")
            ),
            Article(
                4,
                "생활꿀팁",
                "대기업이 환경에 대처하는 법",
                "맥도날드의 에코",
                R.drawable.bg_user_image_default.toString(),
                R.drawable.img_article_test4.toString(),
                "에코코",
                LocalDate.now(),
                content = "내용이 들어감",
                arrayListOf("", "")
            ),
            Article(
                5,
                "생활꿀팁",
                "어촌에서 벼러지는 그물 다시 쓰기",
                "버려지는 그물 어떻게 재활용하면 좋을까?",
                R.drawable.bg_user_image_default.toString(),
                R.drawable.img_article_test5.toString(),
                "에코코",
                LocalDate.now(),
                content = "내용이 들어감",
                arrayListOf("", "")
            ),
        )
    }
} // End of ArticleHomeFragment class
