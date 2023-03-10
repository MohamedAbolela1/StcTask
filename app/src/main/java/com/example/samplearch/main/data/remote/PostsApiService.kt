package com.example.samplearch.main.data.remote

import com.example.samplearch.main.data.model.PostResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PostsApiService {
    @GET("everything")
    suspend fun getPostsList(
        @Query("q") type : String,
        @Query("apikey") apiKey : String,
        @Query("pageSize") pageSize : Int,
        @Query("page") page : Int
    ): PostResponse
}