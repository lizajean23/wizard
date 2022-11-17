package com.example.gakvetili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class finishActivity : AppCompatActivity() {
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        textView1 = findViewById(R.id.Name)
        textView2 = findViewById(R.id.Age)

        textView1.text = intent.extras?.getString("NAME","ki")
        textView2.text = intent.extras?.getInt("AGE",0).toString()

        finish()

    }
}