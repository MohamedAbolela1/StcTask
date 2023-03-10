package com.example.samplearch.model


import com.squareup.moshi.Json

data class ApiErrorResponse(
    @Json(name = "message")
    val message: String?,
)