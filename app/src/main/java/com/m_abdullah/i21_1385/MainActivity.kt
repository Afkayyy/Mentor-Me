package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var back_btn=findViewById<ImageView>(R.id.myImageView)

        back_btn.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

    }
}