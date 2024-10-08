package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val firstNameEditText: EditText = findViewById(R.id.firstname)
        val lastNameEditText: EditText = findViewById(R.id.lastname)
        val genderRadioGroup: RadioGroup = findViewById(R.id.gender)
        val addressEditText: EditText = findViewById(R.id.address)
        val cityEditText: EditText = findViewById(R.id.city)
        val stateEditText: EditText = findViewById(R.id.state)
        val emailEditText: EditText = findViewById(R.id.email)
        val phoneNumberEditText: EditText = findViewById(R.id.phonenumber)
        val dobEditText: EditText = findViewById(R.id.dob)
        val registerButton: Button = findViewById(R.id.registration_btn)
        registerButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val selectedGenderId = genderRadioGroup.checkedRadioButtonId
            val gender = findViewById<RadioButton>(selectedGenderId)?.text.toString()
            val address = addressEditText.text.toString()
            val city = cityEditText.text.toString()
            val state = stateEditText.text.toString()
            val email = emailEditText.text.toString()
            val phoneNumber = phoneNumberEditText.text.toString()
            val dob = dobEditText.text.toString()

            val intent = Intent(this, display_Activity::class.java).apply {
                putExtra("FIRST_NAME", firstName)
                putExtra("LAST_NAME", lastName)
                putExtra("GENDER", gender)
                putExtra("ADDRESS", address)
                putExtra("CITY", city)
                putExtra("STATE", state)
                putExtra("EMAIL", email)
                putExtra("PHONE_NUMBER", phoneNumber)
                putExtra("DOB", dob)
            }
            startActivity(intent)
        }
    }
}