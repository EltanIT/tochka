package com.example.tochka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EnterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)
    }

    fun StartToHomePage(view: View) {
        val intent = Intent(this@EnterActivity,GreetingActivity::class.java)
        startActivity(intent)
        finish()
    }
}