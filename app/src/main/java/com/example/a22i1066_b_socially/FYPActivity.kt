package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FYPActivity : AppCompatActivity() {
    private lateinit var explorepg: ImageView
    private lateinit var chats: ImageView
    private lateinit var profile: ImageView
    private lateinit var post: ImageView
    private lateinit var notificationsfollowing: ImageView
    private lateinit var addStory: ImageView
    private lateinit var viewmystory: ImageView
    private lateinit var viewBilalStory: ImageView
    private lateinit var viewIbbiStory: ImageView

    private lateinit var viewAmmanStory: ImageView
    private lateinit var viewRafayStory: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foryou)
        explorepg = findViewById(R.id.explorepg)
        explorepg.setOnClickListener {
            val intent = Intent(this, ExplorePageActivity::class.java)
            startActivity(intent)
            finish()
        }
        chats = findViewById(R.id.chats)
        chats.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        profile = findViewById(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this, MyProfileActivity::class.java)
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
        addStory = findViewById(R.id.addstory)
        addStory.setOnClickListener {
            val intent = Intent(this, AddStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewmystory = findViewById(R.id.mystory)
        viewmystory.setOnClickListener {
            val intent = Intent(this, MyStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewBilalStory = findViewById(R.id.bilalstory)
        viewBilalStory.setOnClickListener {
            val intent = Intent(this, BilalStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewIbbiStory = findViewById(R.id.ibbistory)
        viewIbbiStory.setOnClickListener {
            val intent = Intent(this, ibbiStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewAmmanStory = findViewById(R.id.ammanstory)
        viewAmmanStory.setOnClickListener {
            val intent = Intent(this, ammanStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewAmmanStory = findViewById(R.id.ammanstory)
        viewAmmanStory.setOnClickListener {
            val intent = Intent(this, ammanStoryActivity::class.java)
            startActivity(intent)
            finish()
        }
        viewRafayStory = findViewById(R.id.rafaystory)
        viewRafayStory.setOnClickListener {
            val intent = Intent(this, rafayStoryActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}