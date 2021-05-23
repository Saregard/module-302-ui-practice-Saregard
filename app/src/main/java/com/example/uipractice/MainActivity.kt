package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.text.DateFormat
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

        signUpButton?.setOnClickListener{
            val singUpIntent = Intent(this, MainActivity3::class.java)
            startActivity(singUpIntent)
        }
        loginButton?.setOnClickListener{
            val loginIntent = Intent(this, MainActivity2::class.java)
            startActivity(loginIntent)
        }

        textViewDate = findViewById(R.id.text_view_date)
        val currentDate = Date()
        val dateFormat = SimpleDateFormat("EEEE MMMM yyyy")
        val dateToShow = dateFormat.format(currentDate)
        textViewDate?.text = dateToShow
    }

}