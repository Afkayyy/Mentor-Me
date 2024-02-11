package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Call_Interface_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calling_interface_page)

        var back_btn=findViewById<TextView>(R.id.close_call)

        back_btn.setOnClickListener{

            val second_intent= Intent(this,Chat_Text_Activity::class.java)
            startActivity(second_intent)
        }
    }
}