package com.itis.summerpractice_hometask3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractice_hometask3.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!

    private var adapter: LandscapeAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter(){
        adapter = LandscapeAdapter(LandscapeRepository.landscapes,
            Glide.with(this)
        ) {
            findNavController().navigate(
                R.id.action_mainFragment_to_descriptionFragment,
                DescriptionFragment.createBundle(it.id))
        }
        binding.rvList.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}