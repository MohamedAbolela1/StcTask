package com.example.samplearch.main.data.repository

import com.example.samplearch.main.data.model.PostResponse
import com.example.samplearch.main.data.remote.PostsRemoteDataSource
import javax.inject.Inject

class PostsRepository @Inject constructor(private val postsRemoteDataSource: PostsRemoteDataSource) {
    suspend fun getPostsList(type:String,apiKey:String,pageSize:Int,page:Int): PostResponse? {
        return postsRemoteDataSource.getPosts(type,apiKey,pageSize,page)
    }
}