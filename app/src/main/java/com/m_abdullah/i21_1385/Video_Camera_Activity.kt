package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Video_Camera_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_camera_page)

        var camera_button=findViewById<TextView>(R.id.open_camera)

        camera_button.setOnClickListener{

            val second_intent= Intent(this,Photo_Camera_Activity::class.java)
            startActivity(second_intent)
        }

        var log_in_button=findViewById<TextView>(R.id.close_camera)

        log_in_button.setOnClickListener{

            val second_intent= Intent(this,Chat_Text_Activity::class.java)
            startActivity(second_intent)
        }
    }
}