package com.itis.summerpractice_hometask3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.itis.summerpractice_hometask3.databinding.ItemLandscapeBinding

class LandscapeAdapter (
    private  var list: List<Landscape>,
    private val glide: RequestManager,
    private  val onItemClick: (Landscape) -> Unit
) : RecyclerView.Adapter<LandscapeHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LandscapeHolder = LandscapeHolder(
        ItemLandscapeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide,
        onItemClick
    )

    override fun onBindViewHolder(
        holder: LandscapeHolder,
        position: Int
    ) {
        holder.OnBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}