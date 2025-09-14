package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MyProfileActivity : AppCompatActivity() {
    private lateinit var post: ImageView
    private lateinit var explorepg: ImageView
    private lateinit var notificationsfollowing: ImageView
    private lateinit var homebutton: ImageView
    private lateinit var editprofile: Button
    private lateinit var highlights: LinearLayout
    private lateinit var footsall: LinearLayout
    private lateinit var friends: LinearLayout
    private lateinit var uploadstory: LinearLayout
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
        highlights = findViewById(R.id.highlights)
        highlights.setOnClickListener {
            val intent = Intent(this, HighlightsActivity::class.java)
            startActivity(intent)
            finish()
        }
        footsall = findViewById(R.id.footsall)
        footsall.setOnClickListener {
            val intent = Intent(this, FootsallActivity::class.java)
            startActivity(intent)
            finish()
        }
        friends = findViewById(R.id.friends)
        friends.setOnClickListener {
            val intent = Intent(this, FriendsActivity::class.java)
            startActivity(intent)
            finish()
        }
        uploadstory = findViewById(R.id.uploadstory)
        uploadstory.setOnClickListener {
            val intent = Intent(this, UploadStoryActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}