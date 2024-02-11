package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Notification_Page_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifications_page)

        var back_btn=findViewById<TextView>(R.id.back_arrow)

        back_btn.setOnClickListener{

            val second_intent= Intent(this,Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }
    }
}