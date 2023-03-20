package com.example.samplearch.home.presentation


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.base.ErrorBinding
import com.example.samplearch.databinding.FragmentHomeBinding
import com.example.samplearch.databinding.LayoutMainErrorBinding
import com.example.samplearch.home.domain.model.Post
import com.example.samplearch.home.presentation.adapter.PostsAdapter
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.model.ViewState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() , ErrorBinding {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding ::inflate

    override val errorLayoutBinding: LayoutMainErrorBinding
        get() = binding.layoutError

    private val mainViewModel by activityViewModels<MainViewModel>()
    private lateinit var postsAdapter: PostsAdapter

    override fun setup() {
        mainViewModel.getProductsServicesList()
        setListeners()
        setupRecyclerView()
        observeViewModels()
    }

    private fun setListeners() {
        binding.swipeRefresh.setOnRefreshListener {
            mainViewModel.refreshServicesList()
        }
    }

    private fun setupRecyclerView() {
        postsAdapter = PostsAdapter(::onPostItemClicked)
        with(binding.rvPosts) {
            adapter = postsAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun onPostItemClicked(post: Post) {
        navigateTo(HomeFragmentDirections.actionFragmentHomeToFragmentDetails(post))
    }

    private fun observeViewModels() {
        with(mainViewModel) {
            loadingStateLiveData.observe(viewLifecycleOwner, ::bindLoadingState)
            shouldClearPreviousList.observe(viewLifecycleOwner, ::bindAdapterState)
            postListState.observe(viewLifecycleOwner, ::bindPostsListState)
        }
    }

    private fun bindAdapterState(shouldClearAdapter: Boolean) {
        if (shouldClearAdapter)
            postsAdapter.clearData()
    }

    private fun bindPostsListState(state: ViewState<MutableList<Post>>) {
        when (state) {
            is ViewState.Success -> onPostsSuccess(state.data)
            is ViewState.Error -> onViewStateError(state.errorTypes)
            else -> {
            }
        }
    }

    private fun onPostsSuccess(postsList: MutableList<Post>) {
        postsAdapter.addAll(postsList)
        bindSuccess(binding.layoutPosts)
    }

    private fun onViewStateError(errorTypes: ErrorTypes) {
        bindError(requireContext(), errorTypes, true, binding.layoutPosts) {
            mainViewModel.reloadServicesList()
        }
    }

    private fun bindLoadingState(loadingTypes: LoadingTypes) {
        with(binding) {
            bindLoading(loadingTypes, progressMain, progressHover, progressPaging, swipeRefresh)
        }
    }
}