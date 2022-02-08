package io.rohail.anchorswap

import androidx.recyclerview.widget.RecyclerView
import io.rohail.anchorswap.databinding.RecyclerItemBinding

class MyItemViewHolder(private val binding: RecyclerItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun initBinding(color: Int) {
        binding.apply {
            root.setBackgroundColor(color)
        }
    }
}