package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChooseAccountActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_account)
        btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val intent = Intent(this, FYPActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            finish()
        }
        val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }
}
