package com.sun.cnn.ui.api

import com.sun.cnn.ui.models.NewsResponse
import com.sun.cnn.ui.util.Constant.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
    @Query("apiKey")
    apiKey:String=API_KEY
    ):Response <NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("country")
      searchQuery: String ,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey:String=API_KEY
    ):Response <NewsResponse>
}