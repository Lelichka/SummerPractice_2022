package com.itis.summerpractice_day2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class EditorFragment : Fragment(R.layout.fragment_editor) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(ARG).orEmpty()
        if (text.isNotEmpty()){
            Snackbar.make(view,text, Snackbar.LENGTH_SHORT).show()
        }
    }

    companion object{
        private  const val ARG = "text"
        fun createBundle(text:String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG,text
            )
            return bundle
        }
    }
}