package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()

        val currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.time)

        val textViewDate = findViewById<TextView>(R.id.text_view_date)
        textViewDate.text = currentDate
    }
}