package com.example.aslbasics

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What does this sign represent?",
            R.drawable.a_letter,
            "B",
            "G",
            "A",
            3
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What does this sign represent?",
            R.drawable.b_letter,
            "J",
            "B",
            "L",
            2
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What does this sign represent?",
            R.drawable.c_letter,
            "C",
            "I",
            "H",
            1
        )
        questionList.add(que3)

        val que4 = Questions(
            4,
            "What does this sign represent?",
            R.drawable.d_letter,
            "O",
            "D",
            "F",
            2
        )
        questionList.add(que4)

        val que5 = Questions(
            5,
            "What does this sign represent?",
            R.drawable.e_letter,
            "T",
            "Y",
            "E",
            3
        )
        questionList.add(que5)

        val que6 = Questions(
                6,
                "What does this sign represent?",
                R.drawable.f_letter,
                "K",
                "F",
                "G",
                2
        )
        questionList.add(que6)

        val que7 = Questions(
                7,
                "What does this sign represent?",
                R.drawable.g_letter,
                "G",
                "U",
                "7",
                1
        )
        questionList.add(que7)

        val que8 = Questions(
                8,
                "What does this sign represent?",
                R.drawable.h_letter,
                "L",
                "H",
                "R",
                2
        )
        questionList.add(que8)

        val que9 = Questions(
                9,
                "What does this sign represent?",
                R.drawable.i_letter,
                "O",
                "P",
                "I",
                3
        )
        questionList.add(que9)

        val que10 = Questions(
                10,
                "What does this sign represent?",
                R.drawable.j_letter,
                "J",
                "Q",
                "W",
                3
        )
        questionList.add(que10)

        val que11 = Questions(
                11,
                "What does this sign represent?",
                R.drawable.k_letter,
                "N",
                "K",
                "B",
                2
        )
        questionList.add(que11)




        return questionList
    }
}