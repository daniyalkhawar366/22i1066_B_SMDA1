package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    private lateinit var homebutton: ImageView
    private lateinit var samChat: LinearLayout
    private lateinit var ammanChat: LinearLayout
    private lateinit var ibbiChat: LinearLayout
    private lateinit var jdChat: LinearLayout
    private lateinit var rafayChat: LinearLayout
    private lateinit var bilalChat: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chats)
        homebutton = findViewById(R.id.backArrow)
        homebutton.setOnClickListener {
            val intent = Intent(this, FYPActivity::class.java)
            startActivity(intent)
            finish()
        }
        samChat = findViewById(R.id.samchat)
        samChat.setOnClickListener {
            val intent = Intent(this, samChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        ammanChat = findViewById(R.id.ammanchat)
        ammanChat.setOnClickListener {
            val intent = Intent(this, ammanChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        ibbiChat = findViewById(R.id.ibbichat)
        ibbiChat.setOnClickListener {
            val intent = Intent(this, ibbiChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        jdChat = findViewById(R.id.jdchat)
        jdChat.setOnClickListener {
            val intent = Intent(this, jdChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        rafayChat = findViewById(R.id.rafaychat)
        rafayChat.setOnClickListener {
            val intent = Intent(this, rafayChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        bilalChat = findViewById(R.id.bilalchat)
        bilalChat.setOnClickListener {
            val intent = Intent(this, bilalChatActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}