package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val name = intent.getStringExtra("Name")
        val surname = intent.getStringExtra("SurName")
        val avatar = intent.getBundleExtra("Avatar")

        val resultLine = findViewById<TextView>(R.id.resultLine)
        resultLine.text = "Name:" + name +"\nSurName" + surname + avatar

    }
}