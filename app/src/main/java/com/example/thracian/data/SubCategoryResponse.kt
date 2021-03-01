package com.example.thracian.data


import androidx.annotation.Nullable
import com.google.gson.annotations.SerializedName

data class SubCategoryResponse(
    @SerializedName("subcategories")
    @Nullable
    val subcategories: List<Subcategory>
)