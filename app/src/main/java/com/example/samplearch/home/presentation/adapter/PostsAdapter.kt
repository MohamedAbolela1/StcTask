package com.example.samplearch.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.samplearch.base.BaseAdapter
import com.example.samplearch.base.BaseViewHolder
import com.example.samplearch.databinding.ItemPostBinding
import com.example.samplearch.home.domain.model.Post
import com.example.samplearch.utils.ui.LoadImage


class PostsAdapter(
    private val onPostItemClicked: (item: Post) -> Unit
) : BaseAdapter<Post>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Post> {
        val binding =
            ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FestivalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Post>, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class FestivalViewHolder(private val binding: ItemPostBinding) :
        BaseViewHolder<Post>(binding.root) {
        override fun onBind(item: Post) {
            binding.root.setOnClickListener { onPostItemClicked(item) }
            val context = binding.root.context
            binding.tvTitle.text = item.title
            LoadImage.loadFestivalImage(context, item.image, binding.imgProduct)
            binding.tvAuthor.text = item.author
        }
    }
}