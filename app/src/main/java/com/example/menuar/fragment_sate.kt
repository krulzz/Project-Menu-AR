package com.example.menuar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class SateFragment : Fragment() {
    override fun onCreateView(i: LayoutInflater, c: ViewGroup?, b: Bundle?) =
        layoutInflater.inflate(R.layout.fragment_sate, c, false)

    override fun onViewCreated(v: View, b: Bundle?) {
        v.findViewById<ImageButton>(R.id.btnSateMaranggi).setOnClickListener {
            val itn = Intent(requireContext(), FoodDetailActivity::class.java).apply {
                putExtra("title", "Sate Maranggi Sapi")
                putExtra("price", "Rp. 25.000")
                putExtra("desc", "Deskripsi singkat…")
                putExtra("imgRes", R.drawable.sate_ayam_maranggi)
            }
            startActivity(itn)
        }
    }
}