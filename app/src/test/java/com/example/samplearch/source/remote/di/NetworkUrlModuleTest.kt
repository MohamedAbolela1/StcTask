package com.example.samplearch.source.remote.di

import com.example.samplearch.utils.platform.Versions
import org.junit.Assert.*
import io.mockk.every
import io.mockk.mockkObject
import org.junit.Test

class NetworkUrlModuleTest{
    @Test
    fun `given BuildConfig when providesBaseUrl then verify correct base url`() {
        // GIVEN
        val baseUrl = "https://newsapi.org/v2/"
        val versions = Versions()
        mockkObject(versions)
        every { versions.baseUrl() } returns (baseUrl)

        // THEN
        val urlModule = NetworkUrlModule
        assertEquals(urlModule.providesBaseUrl(), baseUrl)
    }
}