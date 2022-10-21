package com.eru.month6hw1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eru.month6hw1.databinding.ItemImageBinding

class ImageAdapter(
    private val list: ArrayList<String>,
    private var context: Context,
    private val onClick: (pos: Int) -> Unit
) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    inner class ViewHolder(private var binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            Glide.with(context).load(list[position]).into(binding.imageView)

            binding.root.setOnClickListener {
                if (binding.imageCover.visibility == View.VISIBLE) {
                    binding.imageCover.visibility = View.INVISIBLE
                } else
                    binding.imageCover.visibility = View.VISIBLE

                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = list.size
}