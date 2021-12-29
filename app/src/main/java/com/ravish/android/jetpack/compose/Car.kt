package com.ravish.android.jetpack.compose

import androidx.annotation.DrawableRes

data class Car(
    @DrawableRes val imageResource: Int,
    val name: String,
    val brand: String = "",
    val year: String = ""
)
