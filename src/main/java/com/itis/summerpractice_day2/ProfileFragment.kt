package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.summerpractice_day2.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)
        with(binding){
            btnEditorFromProfile.setOnClickListener {
                findNavController().navigate(
                    R.id.action_profileFragment_to_editorFragment,
                    EditorFragment.createBundle("Profile"))
            }
            avatar.setImageResource(R.drawable.avatar)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}