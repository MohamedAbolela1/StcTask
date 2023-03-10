package com.example.samplearch.main.data.remote

import com.example.samplearch.main.data.model.PostResponse
import com.example.samplearch.source.remote.executer.RemoteExecutor
import javax.inject.Inject

class PostsRemoteDataSource @Inject constructor(private val postsApiService: PostsApiService) :
    RemoteExecutor() {
    suspend fun getPosts(type:String,apiKey:String,pageSize:Int,page:Int): PostResponse? {
        return executeApiCall { postsApiService.getPostsList(type,apiKey,pageSize,page) }
    }
}