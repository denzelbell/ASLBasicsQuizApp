package com.drawbytess.aslbasics

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_options.*

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra((Constants.USER_NAME))

        btn_letters.setOnClickListener {
            val intent = Intent(this, QuizQuestions::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
            finish()
        }

        btn_numbers.setOnClickListener {
            val intent = Intent(this, NumbersQuiz::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
            finish()
        }

        btn_feeling.setOnClickListener {
            val intent = Intent(this, FeelingsQuiz::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
            finish()
        }

        btn_people.setOnClickListener {
            val intent = Intent(this, PeopleQuiz::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
            finish()
        }

    }
}