package com.example.aslbasics

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What letter does this sign represent?",
            R.drawable.a_letter,
            "B",
            "G",
            "A",
            3
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What letter does this sign represent?",
            R.drawable.b_letter,
            "J",
            "B",
            "L",
            2
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What letter does this sign represent?",
            R.drawable.c_letter,
            "C",
            "I",
            "H",
            1
        )
        questionList.add(que3)

        return questionList
    }
}