package com.example.menuar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val viewPager = findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabLayout)

        val titles = listOf("Sate", "Tongseng", "Gulai", "Minuman")

        viewPager.adapter = object : androidx.viewpager2.adapter.FragmentStateAdapter(this) {
            override fun getItemCount() = titles.size
            override fun createFragment(position: Int) = PlaceholderFragment.new(titles[position])
        }

        com.google.android.material.tabs.TabLayoutMediator(tabLayout, viewPager) { tab, pos ->
            tab.text = titles[pos]
        }.attach()
    }
}