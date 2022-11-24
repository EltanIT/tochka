package com.example.tochka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
    }

    fun StartToEnter(view: View) {
        val intent = Intent(this@GreetingActivity,EnterActivity::class.java)
        startActivity(intent)
        finish()

    }
    fun StartToRegistrate(view: View) {
        val intent = Intent(this@GreetingActivity, registration_activity::class.java)
        startActivity(intent)
        finish()

    }
}