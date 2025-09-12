package com.example.menuar

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_menu)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSateAyamDaging = findViewById<ImageButton>(R.id.btn_sate_ayam_daging)
        val btnsateayamcampur = findViewById<ImageButton>(R.id.btn_sate_ayam_campur)
        val btnsateayamtaichan = findViewById<ImageButton>(R.id.btn_sate_ayam_taichan)
        val btnsateayamkulit = findViewById<ImageButton>(R.id.btn_sate_ayam_kulit)
        val btnsateayammaranggi = findViewById<ImageButton>(R.id.btn_sate_ayam_maranggi)
        val btnsateayamkikil = findViewById<ImageButton>(R.id.btn_sate_ayam_kikil)

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.btn_sate_ayam_daging -> {
                    startActivity(Intent(this, DetailSateAyamDaging::class.java))
                }
                R.id.btn_sate_ayam_campur -> {
                    startActivity(Intent(this, detail_sate_ayam_campur::class.java))
                }
                R.id.btn_sate_ayam_taichan -> {
                    startActivity(Intent(this, detail_sate_ayam_taichan::class.java))
                }
                R.id.btn_sate_ayam_kulit -> {
                    startActivity(Intent(this, detail_sate_ayam_kulit::class.java))
                }
                R.id.btn_sate_ayam_maranggi -> {
                    startActivity(Intent(this, sate_maranggi_sapi::class.java))
                }
                R.id.btn_sate_ayam_kikil -> {
                    startActivity(Intent(this, sate_kikil::class.java))
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