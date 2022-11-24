package com.example.tochka

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView

class HomePageActivity : AppCompatActivity() {
    lateinit var home: ImageView
    lateinit var search: ImageView
    lateinit var notification: ImageView
    lateinit var like: ImageView


    @SuppressLint("UseCompatLoadingForDrawables", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        home = findViewById(R.id.HomeButton)
        home.setOnClickListener{
            home.setImageDrawable(getDrawable(R.drawable.main_button_true))
            search.setImageDrawable(getDrawable(R.drawable.search_button))
            notification.setImageDrawable(getDrawable(R.drawable.notification_button))
        }

        search = findViewById(R.id.SearchButton)
        search.setOnClickListener{
            home.setImageDrawable(getDrawable(R.drawable.main_button))
            search.setImageDrawable(getDrawable(R.drawable.search_button_true))
            notification.setImageDrawable(getDrawable(R.drawable.notification_button))
        }

        notification = findViewById(R.id.NotificationButton)
        notification.setOnClickListener{
            home.setImageDrawable(getDrawable(R.drawable.main_button))
            search.setImageDrawable(getDrawable(R.drawable.search_button))
            notification.setImageDrawable(getDrawable(R.drawable.notification_button_true))
        }
        like = findViewById(R.id.Like1)
        like.setOnClickListener{
            when{
                it.id == R.drawable.like ->{

                }
                it.id == R.drawable.like_true -> {

                }
            }

        }



    }

    fun GoToProfile(view: View) {
        val intent = Intent(this@HomePageActivity,ProfileActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun TapHomeButton(view: View) {
        val intent = Intent(this@HomePageActivity,HomePageActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun TapSearchButton(view: View) {
        val intent = Intent(this@HomePageActivity,SearchActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun TapNotificationButton(view: View) {
        val intent = Intent(this@HomePageActivity,NotificationsActivity::class.java)
        startActivity(intent)
        finish()
    }
}


