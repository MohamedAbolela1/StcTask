package com.example.samplearch.home.domain.model

import java.io.Serializable

data class Post(
    val author: String?,
    val title : String? ,
    val image: String?
) : Serializable
