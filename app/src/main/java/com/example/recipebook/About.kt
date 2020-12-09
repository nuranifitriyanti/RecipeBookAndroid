package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val tvDataReceived: TextView = findViewById(R.id.tv_about_author)

        val text = """
            Nurani Fitriyanti
            nurani.fitriyanti@gmail.com
        """.trimIndent()
        tvDataReceived.text = text

        supportActionBar?.title = "About Author"
    }
}