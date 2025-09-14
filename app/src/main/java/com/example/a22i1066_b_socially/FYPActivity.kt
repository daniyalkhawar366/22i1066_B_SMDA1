package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FYPActivity : AppCompatActivity() {
    private lateinit var explorepg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foryou)
        explorepg = findViewById(R.id.explorepg)
        explorepg.setOnClickListener {
            val intent = Intent(this, ExplorePageActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}