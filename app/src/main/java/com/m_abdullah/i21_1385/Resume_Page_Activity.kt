package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Resume_Page_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resume_page)

        var back_home_button=findViewById<TextView>(R.id.back_to_search_results)

        back_home_button.setOnClickListener{

            val second_intent= Intent(this,Search_Result_Activity::class.java)
            startActivity(second_intent)
        }

        var review_button=findViewById<TextView>(R.id.review_btn)

        back_home_button.setOnClickListener{

            val second_intent= Intent(this,Review_Page_Activity::class.java)
            startActivity(second_intent)
        }

        var community_button=findViewById<TextView>(R.id.join_community)

        back_home_button.setOnClickListener{

            val second_intent= Intent(this,Community_Chat_Activity::class.java)
            startActivity(second_intent)
        }
    }
}