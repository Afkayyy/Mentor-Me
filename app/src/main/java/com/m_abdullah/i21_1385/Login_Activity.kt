package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        var reg_button=findViewById<TextView>(R.id.sign_up_link)

        reg_button.setOnClickListener{

            val second_intent=Intent(this,Registration_Activity::class.java)
            startActivity(second_intent)
        }
    }
}