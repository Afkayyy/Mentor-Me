package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Video_Calling_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_calling_interface_page)

        var log_in_button=findViewById<TextView>(R.id.close_vid_call)

        log_in_button.setOnClickListener{

            val second_intent= Intent(this,Chat_Text_Activity::class.java)
            startActivity(second_intent)
        }

    }
}