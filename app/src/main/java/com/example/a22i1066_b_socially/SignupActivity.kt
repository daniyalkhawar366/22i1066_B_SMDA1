package com.example.a22i1066_b_socially

import android.os.Bundle
import android.text.InputType
import android.util.Patterns
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private lateinit var etDob: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var ivTogglePassword: ImageView
    private lateinit var btnCreateAccount: Button

    private var isPasswordVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        etDob = findViewById(R.id.etDob)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        ivTogglePassword = findViewById(R.id.ivTogglePassword)
        btnCreateAccount = findViewById(R.id.btnCreateAccount)

        // Toggle password visibility
        ivTogglePassword.setOnClickListener {
            if (isPasswordVisible) {
                etPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                etPassword.typeface = etPassword.typeface

            } else {
                etPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            }
            etPassword.setSelection(etPassword.text.length) // keep cursor at end
            isPasswordVisible = !isPasswordVisible
        }

        // Validate inputs on button click
        btnCreateAccount.setOnClickListener {
            if (validateInputs()) {
                Toast.makeText(this, "Account Created (Frontend Only)", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateInputs(): Boolean {
        val dob = etDob.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        // Date of birth validation (dd-mm-yyyy)
        val dobRegex = Regex("""\d{2}-\d{2}-\d{4}""")
        if (!dob.matches(dobRegex)) {
            etDob.error = "Enter valid date (dd-mm-yyyy)"
            return false
        }

        // Email validation
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.error = "Enter valid email"
            return false
        }

        // Password validation (min 8 chars, 1 uppercase, 1 number, 1 special char)
        val passwordRegex = Regex("^(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}\$")
        if (!password.matches(passwordRegex)) {
            etPassword.error = "Password must be 8+ chars, include uppercase, number, special char"
            return false
        }

        return true
    }
}
