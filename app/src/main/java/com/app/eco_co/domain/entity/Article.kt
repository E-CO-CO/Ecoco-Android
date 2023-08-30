package com.app.eco_co.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Article @JvmOverloads constructor(
    var articleId: Int,
    var tag: String = "",
    var mainTitle: String = "",
    var subTitle: String = "",
    var userImage: String? = null,
    var thumbnail: String? = null,
    var editorName: String = "",
    var day: LocalDate,
    var content: String = "",
    var images: List<String> = emptyList()
) : Parcelable
