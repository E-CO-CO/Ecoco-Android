package com.app.eco_co.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Validate(val img: String, val validateTag: Boolean, val challengeeName: String) :
    Parcelable
