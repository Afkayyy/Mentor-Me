package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Search_Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_result_page)

        var notif_button=findViewById<TextView>(R.id.John_coopy)

        notif_button.setOnClickListener{

            val second_intent= Intent(this,Resume_Page_Activity::class.java)
            startActivity(second_intent)
        }

        var back_btn=findViewById<TextView>(R.id.back_to_search_result)

        notif_button.setOnClickListener{

            val second_intent= Intent(this,Search_Result_Activity::class.java)
            startActivity(second_intent)
        }
    }
}