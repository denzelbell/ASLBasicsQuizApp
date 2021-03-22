package com.example.aslbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NumbersQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers_quiz)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


    }
}