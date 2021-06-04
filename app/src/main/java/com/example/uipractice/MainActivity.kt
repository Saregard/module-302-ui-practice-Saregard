package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var signUpButton: Button? = null
    private var loginButton: Button? = null
    private var textViewDate: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpButton = findViewById(R.id.sign_up)
        loginButton = findViewById(R.id.login)
        textViewDate = findViewById(R.id.text_view_date)

        signUpButton?.setOnClickListener {
            val singUpIntent = Intent(this, MainActivity3::class.java)
            startActivity(singUpIntent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        loginButton?.setOnClickListener {
            val loginIntent = Intent(this, MainActivity2::class.java)
            startActivity(loginIntent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val currentDate = Date()
        textViewDate?.text = SimpleDateFormat("EEEE MMMM yyyy").format(currentDate)
    }
}