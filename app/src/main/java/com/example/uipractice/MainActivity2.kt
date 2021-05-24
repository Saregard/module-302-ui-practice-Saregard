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
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        val email:String="asd@gmail.com"
        if (email.matches(emailPattern.toRegex())){
            Toast.makeText(this,"Hello ",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Bye Bye ",Toast.LENGTH_LONG).show()
        }

        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)
        forgotPasswordText = findViewById(R.id.forgot_password)
        facebookLoginButton = findViewById(R.id.log_in_with_facebook)

        loginButton?.setOnClickListener {
            when {
                editTextEmail?.length() == 0 -> {
                    editTextEmail?.error = getString(R.string.username_required_error)
                }
                editTextPassword?.length() == 0 -> {
                    editTextPassword?.error = getString(R.string.password_required_error)
                }
                editTextEmail?.text.toString() != emailPattern -> {
                    editTextEmail?.error = getString(R.string.needs_to_be_email)
                }
                else -> Toast.makeText(this, "logged in", Toast.LENGTH_LONG).show()
            }
        }

    }

}
