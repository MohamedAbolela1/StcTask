package com.example.samplearch.home.data.remote

import com.example.samplearch.home.data.model.PostResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PostsApiService {
    @GET(Constants.ApiKeys.EveryThing)
    suspend fun getPostsList(
        @Query(Constants.ApiKeys.Q) type : String,
        @Query(Constants.ApiKeys.API_KEY) apiKey : String,
        @Query(Constants.ApiKeys.PageSize) pageSize : Int,
        @Query(Constants.ApiKeys.Page) page : Int
    ): PostResponse
}