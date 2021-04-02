package com.sun.myapplication.repository

import com.sun.myapplication.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost():Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}