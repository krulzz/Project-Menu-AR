package com.example.menuar

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSate = findViewById<ImageButton>(R.id.btn_sate_main)
        val btnTongseng = findViewById<ImageButton>(R.id.btn_tongseng_main)
        val btnGulai = findViewById<ImageButton>(R.id.btn_gulai_main)
        val btnMinuman = findViewById<ImageButton>(R.id.btn_minuman_main)
        val btnScan = findViewById<ImageButton>(R.id.btn_scan)

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.btn_sate_main -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                }
                R.id.btn_tongseng_main -> {
                    startActivity(Intent(this, TongsengFragment::class.java))
                }
                R.id.btn_gulai_main -> {
                    startActivity(Intent(this, GulaiFragment::class.java))
                }
                R.id.btn_minuman_main -> {
                    startActivity(Intent(this, MinumanFragment::class.java))
                }
            }
        }

// Apply listener ke semua tombol
        btnSate.setOnClickListener(clickListener)
        btnTongseng.setOnClickListener(clickListener)
        btnGulai.setOnClickListener(clickListener)
        btnMinuman.setOnClickListener(clickListener)
        btnScan.setOnClickListener(clickListener)

        btnScan.setOnClickListener {
            // Buat Intent untuk membuka kamera
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            // Cek apakah ada aplikasi kamera yang bisa jalanin Intent ini
            if (cameraIntent.resolveActivity(packageManager) != null) {
                // Jalanin Intent-nya
                startActivity(cameraIntent)
            } else {
                // Tampilkan pesan jika tidak ada aplikasi kamera
                Toast.makeText(this, "Tidak ada aplikasi kamera ditemukan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}