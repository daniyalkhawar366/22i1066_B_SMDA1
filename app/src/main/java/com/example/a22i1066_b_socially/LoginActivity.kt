package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var ivBackArrow: ImageView
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        ivBackArrow = findViewById(R.id.ivbackArrow)
        val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        ivBackArrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close SignupActivity
        }
        // Initialize the login button (assume ID is btnLogin in login.xml)
        btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val intent = Intent(this, FYPActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}