package com.example.samplearch.home.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.samplearch.TestCoroutineRule
import com.example.samplearch.getOrAwaitValue
import com.example.samplearch.home.data.repository.PostsRepository
import com.example.samplearch.home.domain.model.Post
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.ViewState
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel

    @get:Rule
    val coroutineTestRule = TestCoroutineRule()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @RelaxedMockK
    private lateinit var postsRepository: PostsRepository

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        mainViewModel = MainViewModel(postsRepository)
    }

    @Test
    fun `Given No posts list, When init, Then verify State_Error`() {
        // Given
        coEvery { postsRepository.getPostsList(1) }.returns(getPostsResponse())

        // When
        // init

        // Then
        val actualPostsListState: ViewState<MutableList<Post>> =
            mainViewModel.postListState.getOrAwaitValue()

        assertEquals(
            ViewState.Error(ErrorTypes.NoData()),
            actualPostsListState
        )
    }

    @Test
    fun `When getProductsServicesList, Then assert emit Success_state`() {
        // Given
        coEvery { postsRepository.getPostsList(1) }
            .returns(
                getPostsResponse(
                    totalResult = 1,
                    status = "",
                    articles = getPostsResponseList()
                )
            )

        // When
        mainViewModel.getProductsServicesList()

        // Then
        val actualPostsListState = mainViewModel.postListState.getOrAwaitValue()

        assertEquals(
            ViewState.Success(getPostsList()),
            actualPostsListState
        )
    }

    @Test
    fun `When reloadServicesList, Then assert emit Success_state`() {
        // Given
        coEvery { postsRepository.getPostsList(1) }
            .returns(
                getPostsResponse(
                    totalResult = 1,
                    status = "",
                    articles = getPostsResponseList()
                )
            )

        // When
        mainViewModel.reloadServicesList()

        // Then
        val actualPostsListState = mainViewModel.postListState.getOrAwaitValue()

        assertEquals(
            ViewState.Success(getPostsList()),
            actualPostsListState
        )
    }

}