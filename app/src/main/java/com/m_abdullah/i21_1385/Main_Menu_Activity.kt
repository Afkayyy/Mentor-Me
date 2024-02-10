package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Main_Menu_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu_page)

        var notif_button=findViewById<CircleImageView>(R.id.notif_btn)

        notif_button.setOnClickListener{

            val second_intent= Intent(this,Notification_Page_Activity::class.java)
            startActivity(second_intent)
        }

        var search_button=findViewById<TextView>(R.id.search_link)

        search_button.setOnClickListener{

            val second_intent= Intent(this,Search_Page_Activity::class.java)
            startActivity(second_intent)
        }

        var chat_button=findViewById<TextView>(R.id.chat_link)

        chat_button.setOnClickListener{

            val second_intent= Intent(this,Chat_Page_Activiy::class.java)
            startActivity(second_intent)
        }

        var person_button=findViewById<TextView>(R.id.person_link)

        person_button.setOnClickListener{

            val second_intent= Intent(this,Main_Profile_Activity::class.java)
            startActivity(second_intent)
        }
    }
}