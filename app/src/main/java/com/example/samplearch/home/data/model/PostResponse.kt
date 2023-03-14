package com.example.samplearch.home.data.model

import com.squareup.moshi.Json

data class PostResponse(
    @Json(name = "totalResults")
    val totalResults: Int? = 0,
    @Json(name = "status")
    val status: String? = null,
    @Json(name = "articles")
    val articles: List<Articles> = emptyList()
) {
    data class Articles(
        @Json(name = "author")
        val author: String?,
        @Json(name = "title")
        val title: String?,
        @Json(name = "urlToImage")
        val image: String?,
    )
}
