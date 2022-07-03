package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractice_day2.databinding.FragmentMainBinding
import com.itis.summerpractice_day2.databinding.FragmentMusicBinding

class MusicFragment:Fragment(R.layout.fragment_music) {

    private var _binding : FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicBinding.bind(view)
        with(binding){
            btnEditorFromMusic.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment_to_editorFragment,
                    EditorFragment.createBundle("Music"))
            }
            musicImage.setImageResource(R.drawable.gitare)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}