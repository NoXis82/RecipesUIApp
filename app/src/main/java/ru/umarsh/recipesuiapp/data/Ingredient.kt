package ru.umarsh.recipesuiapp.data

import androidx.annotation.DrawableRes

data class Ingredient(
    @DrawableRes val image: Int,
    val title: String,
    val subtitle: String
)
