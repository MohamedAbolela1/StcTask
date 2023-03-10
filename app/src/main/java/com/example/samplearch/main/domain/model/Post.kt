package com.example.samplearch.main.domain.model

import java.io.Serializable

data class Post(
    val author: String?,
    val title : String? ,
    val image: String?
) : Serializable
