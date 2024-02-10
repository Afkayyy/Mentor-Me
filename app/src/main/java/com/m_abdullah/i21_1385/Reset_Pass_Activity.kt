package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Reset_Pass_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reset_password_page)

        var back_to_login_reset=findViewById<TextView>(R.id.back_to_login)

        back_to_login_reset.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

        var back_to_login_reset_link=findViewById<TextView>(R.id.back_to_login_link)

        back_to_login_reset_link.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

        var back_to_login_reset_btn=findViewById<TextView>(R.id.verif_btn)

        back_to_login_reset_btn.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

    }
}