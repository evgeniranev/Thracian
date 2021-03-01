package com.example.thracian.data


import androidx.annotation.Nullable
import com.google.gson.annotations.SerializedName

data class Subcategory(
    @SerializedName("title")
    @Nullable
    val title: String

)