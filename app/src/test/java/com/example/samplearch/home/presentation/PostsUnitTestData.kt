package com.example.samplearch.home.presentation

import com.example.samplearch.home.data.model.PostResponse
import com.example.samplearch.home.domain.model.Post

fun getPostsResponse(
    totalResult: Int = 0,
    status: String = "",
    articles: List<PostResponse.Articles> = emptyList()
) = PostResponse(totalResults = totalResult, status = status, articles = articles)

private val article = PostResponse.Articles(author = "Author", title = "Title", image = "ImageUrl")

private val post = Post(author = "Author", title = "Title", image = "ImageUrl")

fun getPostsResponseList() = listOf(article, article, article)

fun getPostsList() = listOf(post, post, post)