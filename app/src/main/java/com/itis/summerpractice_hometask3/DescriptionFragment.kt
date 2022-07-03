package com.itis.summerpractice_hometask3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractice_hometask3.databinding.FragmentDescriptionBinding

class DescriptionFragment : Fragment(R.layout.fragment_description) {

    private var _binding : FragmentDescriptionBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDescriptionBinding.bind(view)

        val _new_id = arguments?.getInt(ARG)
        val new_id : Int = _new_id ?: 0
        val new_landscape = LandscapeRepository.FindById(new_id)

        with(binding){
            name.text ="Пейзаж: ${new_landscape.name}"
            city.text = "Город: ${new_landscape.city}"
            description.text = "Описание: ${new_landscape.description}"

            Glide.with(root)
                .load(new_landscape.url)
                .placeholder(R.drawable.flowers)
                .error(R.drawable.flowers)
                .into(image)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private const val ARG = "id"
        fun createBundle(id:Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(
                ARG,id
            )
            return bundle
        }
    }
}