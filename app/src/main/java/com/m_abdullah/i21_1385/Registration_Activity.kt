package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Registration_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_page)

        var sign_up_button=findViewById<Button>(R.id.Sign_up_btn)

        sign_up_button.setOnClickListener{

            val second_intent= Intent(this,Verification_Activity::class.java)
            startActivity(second_intent)
        }

        var log_in_button=findViewById<TextView>(R.id.log_in_link)

        log_in_button.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

    }
}