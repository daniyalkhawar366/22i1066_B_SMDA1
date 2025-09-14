package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ibbiStoryActivity : AppCompatActivity() {
    private lateinit var homebutton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ibbistory)
        homebutton = findViewById(R.id.homebtn)
        homebutton.setOnClickListener {
            val intent = Intent(this, FYPActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}