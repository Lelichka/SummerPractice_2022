package com.itis.summerpractice_hometask3

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.itis.summerpractice_hometask3.databinding.ItemLandscapeBinding

class LandscapeHolder(
    private val binding: ItemLandscapeBinding,
    private val glide: RequestManager,
    private var onItemclick: (Landscape) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun OnBind(landscape: Landscape) {
        with(binding){
            tvName.text = landscape.name
            tvCity.text = landscape.city
            root.setOnClickListener{
                onItemclick(landscape)
            }
            glide
                .load(landscape.url)
                .placeholder(R.drawable.flowers)
                .error(R.drawable.flowers)
                .into(tvImage)
        }
    }
}