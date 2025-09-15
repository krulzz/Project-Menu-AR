package com.example.menuar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import com.google.android.material.card.MaterialCardView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class SateFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Cari tombol-tombolnya dari 'view' yang sudah di-inflate
        val btnSateAyamDaging = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_daging)
        val btnsateayamcampur = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_campur)
        val btnsateayamtaichan = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_taichan)
        val btnsateayamkulit = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_kulit)
        val btnsateayammaranggi = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_maranggi)
        val btnsateayamkikil = view.findViewById<MaterialCardView>(R.id.btn_sate_ayam_kikil)

        val clickListener = View.OnClickListener { v ->
            val context = requireContext() // Ambil konteks Fragment
            when (v.id) {
                R.id.btn_sate_ayam_daging -> {
                    startActivity(Intent(context, DetailSateAyamDaging::class.java))
                }

                R.id.btn_sate_ayam_campur -> {
                    startActivity(Intent(context, detail_sate_ayam_campur::class.java))
                }

                R.id.btn_sate_ayam_taichan -> {
                    startActivity(Intent(context, detail_sate_ayam_taichan::class.java))
                }

                R.id.btn_sate_ayam_kulit -> {
                    startActivity(Intent(context, detail_sate_ayam_kulit::class.java))
                }

                R.id.btn_sate_ayam_maranggi -> {
                    startActivity(Intent(context, sate_maranggi_sapi::class.java))
                }

                R.id.btn_sate_ayam_kikil -> {
                    startActivity(Intent(context, sate_kikil::class.java))
                }
            }
        }

        // Apply listener ke semua tombol
        btnSateAyamDaging.setOnClickListener(clickListener)
        btnsateayamcampur.setOnClickListener(clickListener)
        btnsateayamtaichan.setOnClickListener(clickListener)
        btnsateayamkulit.setOnClickListener(clickListener)
        btnsateayammaranggi.setOnClickListener(clickListener)
        btnsateayamkikil.setOnClickListener(clickListener)
        }
    }