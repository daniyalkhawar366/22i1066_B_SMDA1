package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ibbiHighlights2Activity : AppCompatActivity() {
    private lateinit var closebtn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ibbihighlight2)
        closebtn = findViewById(R.id.closeibbi)
        closebtn.setOnClickListener {
            val intent = Intent(this, IbbiProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}