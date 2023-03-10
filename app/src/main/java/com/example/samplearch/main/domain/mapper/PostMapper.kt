package com.example.samplearch.main.domain.mapper

import com.example.samplearch.main.data.model.PostResponse
import com.example.samplearch.main.domain.model.Post


fun MutableList<PostResponse.Articles>.toPostList(): MutableList<Post> {
    return this.map {
        it.toPost()
    }.toMutableList()
}

fun PostResponse.Articles.toPost(): Post {
    return with(this) {
        Post(
            author = author,
            title = title,
            image = image
        )
    }
}
