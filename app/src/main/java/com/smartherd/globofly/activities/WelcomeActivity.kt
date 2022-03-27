package com.example.globofly.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.globofly.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val message:TextView = findViewById(R.id.message)
        message.text = "Black Friday! Get 50% cash back on saving your first spot."
    }
    fun getStarted(view: View) {
        val intent = Intent(this, DestinationListActivity::class.java)
        startActivity(intent)
        finish()
    }
}