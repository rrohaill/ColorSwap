package io.rohail.anchorswap

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.rohail.anchorswap.databinding.RecyclerItemBinding

class RecyclerAdapter(private val randomColorList: List<Int>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MyItemViewHolder(binding = RecyclerItemBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyItemViewHolder)
            holder.initBinding(randomColorList[position])
    }

    override fun getItemCount(): Int = randomColorList.size
}