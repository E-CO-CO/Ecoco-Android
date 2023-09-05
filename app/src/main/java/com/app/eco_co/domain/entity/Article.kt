package com.app.eco_co.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Article constructor(
    val articleId: Int,
    val tag: String = "",
    val mainTitle: String = "",
    val subTitle: String = "",
    val userImage: String? = null,
    val thumbnail: String? = null,
    val editorName: String = "",
    val day: LocalDate,
    val content: String = "",
    val images: List<String> = emptyList()
) : Parcelable
