package com.example.gakvetili

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar

class secondActivity : AppCompatActivity() {
    private lateinit var ageEditText: EditText
    private lateinit var finishButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ageEditText = findViewById(R.id.textName)
        finishButton = findViewById(R.id.Finish)

        val name = intent.extras?.getString("NAME","va")

        finishButton.setOnClickListener{

            val age = ageEditText.text.toString().toInt()

            val intent = Intent(this,finishActivity::class.java)
            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)
            startActivity(intent)
        }
    }
}