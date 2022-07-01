package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.summerpractice_day2.databinding.FragmentMainBinding
import com.itis.summerpractice_day2.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment(R.layout.fragment_messages) {

    private var _binding : FragmentMessagesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMessagesBinding.bind(view)
        with(binding){
            btnEditorFromMessages.setOnClickListener {
                findNavController().navigate(
                    R.id.action_messagesFragment_to_editorFragment,
                    EditorFragment.createBundle("Messages"))
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}