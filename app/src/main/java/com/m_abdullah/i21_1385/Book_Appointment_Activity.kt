package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Book_Appointment_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_appointment_page)


        var back_btn=findViewById<TextView>(R.id.back_arrow)

        back_btn.setOnClickListener{

            val second_intent= Intent(this,Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }

        var call_btn=findViewById<TextView>(R.id.call_page)

        call_btn.setOnClickListener{

            val second_intent= Intent(this,Call_Interface_Activity::class.java)
            startActivity(second_intent)
        }

        var video_call_btn=findViewById<TextView>(R.id.video_call_page)

        video_call_btn.setOnClickListener{

            val second_intent= Intent(this,Video_Calling_Activity::class.java)
            startActivity(second_intent)
        }

        var chat_btn=findViewById<TextView>(R.id.chat_page)

        chat_btn.setOnClickListener{

            val second_intent= Intent(this,Chat_Page_Activiy::class.java)
            startActivity(second_intent)
        }

        var book_btn=findViewById<TextView>(R.id.submit_feedack)

        book_btn.setOnClickListener{

            val second_intent= Intent(this,Book_Session_Activity::class.java)
            startActivity(second_intent)
        }
    }
}