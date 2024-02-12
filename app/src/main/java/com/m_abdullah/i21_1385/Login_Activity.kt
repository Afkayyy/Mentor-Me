package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        var log_button=findViewById<Button>(R.id.login_button)

        log_button.setOnClickListener {

            val second_intent = Intent(this, Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }

        var forgot_button=findViewById<TextView>(R.id.forgot_text)

        forgot_button.setOnClickListener{

            val second_intent=Intent(this,Forgot_Password_Activity::class.java)
            startActivity(second_intent)
        }
    }
}