package com.example.samplearch.productDetails.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.samplearch.R
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.databinding.FragmentDetailsBinding
import com.example.samplearch.home.domain.model.Post
import com.example.samplearch.utils.ui.LoadImage
import com.example.samplearch.utils.ui.getValidText


class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDetailsBinding
        get() = FragmentDetailsBinding ::inflate

    private lateinit var post: Post
    private val args : DetailsFragmentArgs by navArgs()

    override fun setup() {
        setToolbar(
            mToolbar = binding.toolbarDetails.toolbar,
            navigationIconDrawable = R.drawable.ic_back
        )

        post = args.postItem
        bindData(post)
    }

    private fun bindData(post: Post) {
        with(binding){
            LoadImage.loadFestivalImage(requireContext(),post.image,imgProduct)
            tvAuthor.text = post.author.getValidText()
            tvTitle.text = post.title.getValidText()
        }
    }

}