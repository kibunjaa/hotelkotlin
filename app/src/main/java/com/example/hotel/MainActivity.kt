package com.example.hotel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.hotel.R.id.login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 : TextView = findViewById<Button>(login)
            button1.setOnClickListener{
                var open = Intent(this,home::class.java)
                startActivity(open)
            }
        var button2 : TextView = findViewById(R.id.signup)
            button2.setOnClickListener{
                var open = Intent(this,signup::class.java)
                startActivity(open)
            }
        }
}