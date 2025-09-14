package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MyProfileActivity : AppCompatActivity() {
    private lateinit var post: ImageView
    private lateinit var explorepg: ImageView
    private lateinit var notificationsfollowing: ImageView
    private lateinit var homebutton: ImageView
    private lateinit var editprofile: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        explorepg = findViewById(R.id.explorepg)
        explorepg.setOnClickListener {
            val intent = Intent(this, ExplorePageActivity::class.java)
            startActivity(intent)
            finish()
        }
        post = findViewById(R.id.post)
        post.setOnClickListener {
            val intent = Intent(this, MakePostActivity::class.java)
            startActivity(intent)
            finish()
        }
        notificationsfollowing = findViewById(R.id.notificationsfollowing)
        notificationsfollowing.setOnClickListener {
            val intent = Intent(this, NotificationsFollowingActivity::class.java)
            startActivity(intent)
            finish()
        }
        homebutton = findViewById(R.id.homebtn)
        homebutton.setOnClickListener {
            val intent = Intent(this, FYPActivity::class.java)
            startActivity(intent)
            finish()
        }
        editprofile = findViewById(R.id.editprofile)
        editprofile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}