package com.example.menuar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unity3d.player.UnityPlayerActivity

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

        // 1. Deklarasikan semua tombol
        val btnSate = findViewById<ImageButton>(R.id.btn_sate_main)
        val btnTongseng = findViewById<ImageButton>(R.id.btn_tongseng_main)
        val btnGulai = findViewById<ImageButton>(R.id.btn_gulai_main)
        val btnMinuman = findViewById<ImageButton>(R.id.btn_minuman_main)
        val btnScan = findViewById<ImageButton>(R.id.btn_scan)

        // 2. Buat satu listener untuk semua tombol
        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.btn_sate_main -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                }

                // TODO: PERBAIKI INI! Jangan panggil Fragment langsung.
                // Buat Activity baru (misal: DetailActivity) untuk menampung Fragment ini.
                R.id.btn_tongseng_main -> {
                    // Contoh cara memanggil Activity penampung:
                    val intent = Intent(this, TongsengFragment::class.java)
                    intent.putExtra("MENU", "TONGSENG")
                    startActivity(intent)
                }

                R.id.btn_gulai_main -> {
                    // Lakukan hal yang sama seperti tongseng
                }

                R.id.btn_minuman_main -> {
                    // Lakukan hal yang sama seperti tongseng
                }

                // Ini adalah intent untuk membuka AR dari Unity
                R.id.btn_scan -> {
                    startActivity(Intent(this, UnityPlayerActivity::class.java))
                }
            }
        }

        // 3. Pasang listener ke setiap tombol (DI LUAR BLOK LISTENER)
        btnSate.setOnClickListener(clickListener)
        btnTongseng.setOnClickListener(clickListener)
        btnGulai.setOnClickListener(clickListener)
        btnMinuman.setOnClickListener(clickListener)
        btnScan.setOnClickListener(clickListener)
    }
}