package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity(){

    private var editTextEmail: EditText? = null
    private var editTextPassword: EditText? = null
    private var loginButton: Button? = null
    private var forgotPasswordText: TextView? = null
    private var facebookLoginButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)
        forgotPasswordText = findViewById(R.id.forgot_password)
        facebookLoginButton = findViewById(R.id.log_in_with_facebook)
        configureClickListener()

    }
    private fun configureClickListener() {
        loginButton?.setOnClickListener {
            val email = editTextEmail?.text.toString()
            when {
                email.isEmpty() -> {
                    editTextEmail?.error = getString(R.string.username_required_error)
                }
                editTextPassword?.text.toString().isEmpty() -> {
                    editTextPassword?.error = getString(R.string.password_required_error)
                }
                else -> Toast.makeText(this, "Logged in", Toast.LENGTH_LONG).show()
            }

            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(this,"Hello ",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Bye Bye ",Toast.LENGTH_LONG).show()
            }

        }
    }

}
