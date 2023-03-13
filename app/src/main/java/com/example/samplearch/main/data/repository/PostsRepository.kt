package com.example.samplearch.main.data.repository

import com.example.samplearch.main.data.model.PostResponse
import com.example.samplearch.main.data.remote.PostsRemoteDataSource
import javax.inject.Inject

class PostsRepository @Inject constructor(private val postsRemoteDataSource: PostsRemoteDataSource) {
    suspend fun getPostsList(page:Int): PostResponse? {
        return postsRemoteDataSource.getPosts(page)
    }
}