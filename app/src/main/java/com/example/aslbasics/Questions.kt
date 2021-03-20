package com.example.aslbasics

data class Questions (
        val id: Int,
        val questions: String,
        val image: Int,
        val opt1: String,
        val opt2: String,
        val opt3: String,
        val correctAnswer: Int
        )