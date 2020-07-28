package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_name = findViewById<EditText>(R.id.edit_name)
        val edit_surname = findViewById<EditText>(R.id.edit_surname)
        val edit_avatar = findViewById<ImageView>(R.id.edit_avatar)
        val button_save = findViewById<Button>(R.id.button_save)

        button_save.setOnClickListener{
            var name = edit_name.text.toString()
            var surname = edit_surname.text.toString()
            var avatar = edit_avatar.imageAlpha

            var intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("SurName", surname)
            intent.putExtra("Avatar", avatar)
            startActivity(intent)

        }

    }
}