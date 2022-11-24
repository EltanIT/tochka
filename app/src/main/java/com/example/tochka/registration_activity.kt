package com.example.tochka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class registration_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun Continue(view: View) {
        val intent = Intent(this@registration_activity,HobbyActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@registration_activity, GreetingActivity::class.java)
        startActivity(intent)
        finish()

    }

}