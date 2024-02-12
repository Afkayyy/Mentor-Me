package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Main_Menu_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu_page)

        var notif_button=findViewById<CircleImageView>(R.id.notif_btn)
        notif_button.setOnClickListener{

            val notif_intent= Intent(this,Notification_Page_Activity::class.java)
            startActivity(notif_intent)
        }

        var add_mentor_button=findViewById<CircleImageView>(R.id.add_mentor)

        add_mentor_button.setOnClickListener{

            val am_intent= Intent(this,Add_Mentor_Activity::class.java)
            startActivity(am_intent)
        }

        var search_button=findViewById<TextView>(R.id.search_link)

        search_button.setOnClickListener{

            val se_intent= Intent(this,Search_Page_Activity::class.java)
            startActivity(se_intent)
        }

        var chat_button=findViewById<TextView>(R.id.chat_link_main)

        chat_button.setOnClickListener{

            val se_intent= Intent(this,Chat_Page_Activiy::class.java)
            startActivity(se_intent)
        }

        var person_button=findViewById<TextView>(R.id.person_link_main)

        person_button.setOnClickListener{

            val per_intent= Intent(this,Main_Profile_Activity::class.java)
            startActivity(per_intent)
        }

        var john_button=findViewById<TextView>(R.id.john)

        john_button.setOnClickListener{

            val per_intent= Intent(this,Resume_Page_Activity::class.java)
            startActivity(per_intent)
        }
    }
}