package com.m_abdullah.i21_1385

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Verification_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verification_page)

        var verification_button=findViewById<Button>(R.id.verif_btn)

        verification_button.setOnClickListener{

            val second_intent= Intent(this,Login_Activity::class.java)
            startActivity(second_intent)
        }

        var verification_back_button=findViewById<TextView>(R.id.back_btn_verif_pg)

        verification_back_button.setOnClickListener{

            val second_intent= Intent(this,Registration_Activity::class.java)
            startActivity(second_intent)
        }

    }
}