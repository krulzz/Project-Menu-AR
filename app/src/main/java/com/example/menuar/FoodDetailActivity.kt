package com.example.menuar

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val title = intent.getStringExtra("title") ?: ""
        val imgRes = intent.getIntExtra("imgRes", 0)

        findViewById<TextView>(R.id.tvTitle).text = title
        if (imgRes != 0) findViewById<ImageView>(R.id.ivPhoto).setImageResource(imgRes)
    }
}
