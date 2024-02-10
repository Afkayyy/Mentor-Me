package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Search_Page_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_page)

        var back_home_button=findViewById<TextView>(R.id.back_to_home)

        back_home_button.setOnClickListener{

            val second_intent= Intent(this,Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }

        var home_button=findViewById<TextView>(R.id.home_link)

        home_button.setOnClickListener{

            val second_intent= Intent(this,Main_Menu_Activity::class.java)
            startActivity(second_intent)
        }

        var searchresult=findViewById<TextView>(R.id.john_cooper_page)

        searchresult.setOnClickListener{

            val second_intent= Intent(this,Search_Result_Activity::class.java)
            startActivity(second_intent)
        }

        var add_ment_button=findViewById<TextView>(R.id.add_search)

        add_ment_button.setOnClickListener{

            val second_intent= Intent(this,Add_Mentor_Activity::class.java)
            startActivity(second_intent)
        }

        var chat_button=findViewById<TextView>(R.id.chat_link)

        chat_button.setOnClickListener{

            val second_intent= Intent(this,Chat_Page_Activiy::class.java)
            startActivity(second_intent)
        }

        var person_button=findViewById<TextView>(R.id.profile_link)

        person_button.setOnClickListener{

            val second_intent= Intent(this,Main_Profile_Activity::class.java)
            startActivity(second_intent)
        }
    }
}