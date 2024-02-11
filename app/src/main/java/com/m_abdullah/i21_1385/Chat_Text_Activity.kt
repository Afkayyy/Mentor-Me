package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Chat_Text_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_chat_page)

        var back_btn=findViewById<TextView>(R.id.back_arrow)

        back_btn.setOnClickListener{

            val second_intent= Intent(this,Chat_Page_Activiy::class.java)
            startActivity(second_intent)
        }

        var search_button=findViewById<TextView>(R.id.search_link)
        search_button.setOnClickListener{

            val second_intent= Intent(this,Search_Page_Activity::class.java)
            startActivity(second_intent)
        }

        var home_button=findViewById<TextView>(R.id.home_link)

        home_button.setOnClickListener{

            val second_intent= Intent(this,Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }

        var person_button=findViewById<TextView>(R.id.person_link)

        person_button.setOnClickListener{

            val second_intent= Intent(this,Main_Profile_Activity::class.java)
            startActivity(second_intent)
        }

        var call_button=findViewById<TextView>(R.id.call_btn)

        call_button.setOnClickListener{

            val second_intent= Intent(this,Call_Interface_Activity::class.java)
            startActivity(second_intent)
        }

        var vid_call_btn=findViewById<TextView>(R.id.video_call_btn)

        person_button.setOnClickListener{

            val second_intent= Intent(this,Video_Calling_Activity::class.java)
            startActivity(second_intent)
        }



    }
}