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
import java.util.*

class MainActivity : AppCompatActivity() {

    private var signUpButton: Button? = null
    private var loginButton: Button? = null



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

        val calendar = Calendar.getInstance()
        val currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.time)
        val textViewDate = findViewById<TextView>(R.id.text_view_date)
        textViewDate.text = currentDate
    }
}