package com.example.a22i1066_b_socially

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    private lateinit var closebtn: TextView
    private lateinit var nextbtn: TextView
    private lateinit var changePhotoText: TextView
    private lateinit var profileImage: ImageView
    private lateinit var switchAccount: TextView

    // EditText fields
    private lateinit var editName: EditText
    private lateinit var editUsername: EditText
    private lateinit var editWebsite: EditText
    private lateinit var editBio: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var editGender: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accountinfo)

        initializeViews()
        setupClickListeners()
        setupGenderSpinner()
    }

    private fun initializeViews() {
        // Header buttons
        closebtn = findViewById(R.id.closebtn)
        nextbtn = findViewById(R.id.nextbtn)

        // Profile image and change photo
        profileImage = findViewById(R.id.profile_image_edit)
        changePhotoText = findViewById(R.id.change_photo_text)

        // Switch account
        switchAccount = findViewById(R.id.switch_account)

        // EditText fields
        editName = findViewById(R.id.edit_name)
        editUsername = findViewById(R.id.edit_username)
        editWebsite = findViewById(R.id.edit_website)
        editBio = findViewById(R.id.edit_bio)
        editEmail = findViewById(R.id.edit_email)
        editPhone = findViewById(R.id.edit_phone)
        editGender = findViewById(R.id.edit_gender)
    }

    private fun setupClickListeners() {
        closebtn.setOnClickListener {
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        nextbtn.setOnClickListener {
            // Here you could save the changes if needed
            saveProfileChanges()
            val intent = Intent(this, MyProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        switchAccount.setOnClickListener {
            // Handle switch to professional account
            Toast.makeText(this, "Switch to Professional Account", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupGenderSpinner() {
        val genderOptions = arrayOf("Male", "Female", "Other", "Prefer not to say")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genderOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        editGender.adapter = adapter

        // Set default selection to "Male" to match the original
        editGender.setSelection(0)

        editGender.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                val selectedGender = genderOptions[position]
                // Handle gender selection if needed
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle case when nothing is selected
            }
        }
    }

    private fun saveProfileChanges() {
        // Get values from EditText fields
        val name = editName.text.toString().trim()
        val username = editUsername.text.toString().trim()
        val website = editWebsite.text.toString().trim()
        val bio = editBio.text.toString().trim()
        val email = editEmail.text.toString().trim()
        val phone = editPhone.text.toString().trim()
        val gender = editGender.selectedItem.toString()

        // Here you would normally save these values to a database or preferences
        // For now, just show a toast to indicate the changes were "saved"
        Toast.makeText(this, "Profile updated successfully!", Toast.LENGTH_SHORT).show()

        // You could also validate the fields here
        if (name.isEmpty()) {
            editName.error = "Name cannot be empty"
            return
        }

        if (username.isEmpty()) {
            editUsername.error = "Username cannot be empty"
            return
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editEmail.error = "Please enter a valid email"
            return
        }
    }
}