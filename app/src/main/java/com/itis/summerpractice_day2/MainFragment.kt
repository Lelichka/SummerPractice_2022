package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.summerpractice_day2.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        with(binding){
            btnEditorFromMain.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_editorFragment,
                    EditorFragment.createBundle("Main page"))
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}