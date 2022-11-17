package com.example.gakvetili

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        val actionBar:ActionBar? = supportActionBar
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameEditText = findViewById(R.id.editTextName)
        nextButton = findViewById(R.id.button)
        nextButton.setOnClickListener{


            val name: String = nameEditText.text.toString()

            val intent = Intent(this,secondActivity::class.java)
            intent.putExtra("NAME",name)
            startActivity(intent)
        }
    }
}