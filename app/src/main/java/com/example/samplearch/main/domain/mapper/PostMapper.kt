package com.example.samplearch.main.domain.mapper

import com.example.samplearch.main.data.model.PostResponse
import com.example.samplearch.main.domain.model.Post
import com.example.samplearch.model.StringModel
import com.example.samplearch.utils.ui.DateFormat
import com.example.samplearch.utils.ui.getValidText


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
