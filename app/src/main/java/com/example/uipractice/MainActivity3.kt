package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    private var editTextName: EditText? = null
    private var editTextEmail: EditText? = null
    private var editTextPassword: EditText? = null
    private var createAccountButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        editTextName = findViewById(R.id.name)
        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        createAccountButton = findViewById(R.id.create_account)
        configureClickListener()
    }

    private fun configureClickListener() {

        createAccountButton?.setOnClickListener {
            val name = editTextName?.text.toString()
            val email = editTextEmail?.text.toString()
            val password = editTextPassword?.text.toString()

            if (name.isEmpty()) {
                editTextName?.error = getString(R.string.name_required_error)
            }
            if (email.isEmpty()) {
                editTextEmail?.error = getString(R.string.email_required_error)
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches() && email.isNotEmpty()) {
                editTextEmail?.error = getString(R.string.needs_to_be_an_email)
            }
            if (password.length < 6) {
                editTextPassword?.error = getString(R.string.password_needs_at_least_6_characters)
            }
            if (password.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Account created", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}