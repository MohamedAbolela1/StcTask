package com.example.samplearch.main.data.model

import com.squareup.moshi.Json

data class PostResponse(
    @Json(name = "totalResults")
    val totalResults: Int?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "articles")
    val articles: List<Articles>
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
