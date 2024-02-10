package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Forgot_Password_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_page)

        var frgt_back_button=findViewById<TextView>(R.id.frgt_back_btn)

        frgt_back_button.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

        var login_back_button=findViewById<TextView>(R.id.log_in_link_frgt)

        login_back_button.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

        var send_mail_button=findViewById<Button>(R.id.verif_btn)

        frgt_back_button.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }
    }
}