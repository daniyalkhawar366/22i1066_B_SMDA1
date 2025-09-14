package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class jdCallActivity : AppCompatActivity() {
    private lateinit var endbtn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jdcall)
        endbtn = findViewById(R.id.endCallButton)
        endbtn.setOnClickListener {
            val intent = Intent(this, jdChatActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}