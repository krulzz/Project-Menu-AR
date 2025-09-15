package com.example.menuar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.card.MaterialCardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TongsengFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TongsengFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_tongseng, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val btnTongsengAyam = view.findViewById<MaterialCardView>(R.id.btn_tongseng_ayam)
        val btnTongsengKambing = view.findViewById<MaterialCardView>(R.id.btn_tongseng_kambing)
        val btnTongsengSapi = view.findViewById<MaterialCardView>(R.id.btn_tongseng_sapi)

        val clickListener = View.OnClickListener { v ->
            val context = requireContext() // Ambil konteks Fragment
            when (v.id) {
                R.id.btn_tongseng_ayam -> {
                    startActivity(Intent(context, detail_tongseng_ayam::class.java))
                }

                R.id.btn_tongseng_kambing -> {
                    startActivity(Intent(context, detail_tongseng_kambing::class.java))
                }

                R.id.btn_tongseng_sapi -> {
                    startActivity(Intent(context, detail_tongseng_sapi::class.java))
                }
            }
        }
        btnTongsengAyam.setOnClickListener(clickListener)
        btnTongsengKambing.setOnClickListener(clickListener)
        btnTongsengSapi.setOnClickListener(clickListener)

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TongsengFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TongsengFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}