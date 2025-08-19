package com.example.menuar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PlaceholderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return TextView(requireContext()).apply {
            text = arguments?.getString("title") ?: "Page"
            textSize = 24f
        }
    }

    companion object {
        fun new(title: String) = PlaceholderFragment().apply {
            arguments = Bundle().apply { putString("title", "$title page") }
        }
    }
}
