package com.example.menuar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.card.MaterialCardView

class TongsengFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tongseng, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Cari tombol-tombolnya dari 'view'
        val btnTongsengAyam = view.findViewById<MaterialCardView>(R.id.btn_tongseng_ayam)
        val btnTongsengKambing = view.findViewById<MaterialCardView>(R.id.btn_tongseng_kambing)
        val btnTongsengSapi = view.findViewById<MaterialCardView>(R.id.btn_tongseng_sapi)

        // Atur fungsi klik menggunakan lambda yang lebih ringkas
        btnTongsengAyam?.setOnClickListener {
            val context = requireContext()
            startActivity(Intent(context, detail_tongseng_ayam::class.java))
        }

        btnTongsengKambing?.setOnClickListener {
            val context = requireContext()
            startActivity(Intent(context, detail_tongseng_kambing::class.java))
        }

        btnTongsengSapi?.setOnClickListener {
            val context = requireContext()
            startActivity(Intent(context, detail_tongseng_sapi::class.java))
        }
    }
}