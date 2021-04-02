package com.example.retrofitexampler.model

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId")
    val myUserId:Int,
    val id:Int,
    val title: Int,
    val body: Int
)