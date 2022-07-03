package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.summerpractice_day2.databinding.FragmentMainBinding
import com.itis.summerpractice_day2.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private var _binding : FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSearchBinding.bind(view)
        with(binding){
            btnEditorFromSearch.setOnClickListener {
                findNavController().navigate(
                    R.id.action_searchFragment_to_editorFragment,
                    EditorFragment.createBundle("Search"))
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}