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

        loginButton?.setOnClickListener {
            if (editTextEmail?.length() == 0){
                editTextEmail?.error = getString(R.string.username_required_error)
                true
            }else if (editTextPassword?.length() == 0) {
                editTextPassword?.error = getString(R.string.password_required_error)
                true
            }else
                false
        }

    }

}
