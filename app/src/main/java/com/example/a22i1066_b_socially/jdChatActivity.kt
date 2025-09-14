package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class jdChatActivity : AppCompatActivity() {
    private lateinit var homebutton: ImageView
    private lateinit var videobutton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jdchat)
        homebutton = findViewById(R.id.backButton)
        homebutton.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        videobutton = findViewById(R.id.videoCallButton)
        videobutton.setOnClickListener {
            val intent = Intent(this, jdCallActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}