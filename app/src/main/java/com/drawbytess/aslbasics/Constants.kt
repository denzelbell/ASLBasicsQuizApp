package com.drawbytess.aslbasics

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
                1,
                "What does this sign represent?",
                R.drawable.a_letter,
                "S",
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
                "H",
                1
        )
        questionList.add(que7)

        val que8 = Questions(
                8,
                "What does this sign represent?",
                R.drawable.h_letter,
                "L",
                "H",
                "G",
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
                1
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

        val que12 = Questions(
                12,
                "What does this sign represent?",
                R.drawable.l_letter,
                "A",
                "O",
                "L",
                3
        )
        questionList.add(que12)

        val que13 = Questions(
                13,
                "What does this sign represent?",
                R.drawable.m_letter,
                "M",
                "T",
                "N",
                1
        )
        questionList.add(que13)

        val que14 = Questions(
                14,
                "What does this sign represent?",
                R.drawable.n_letter,
                "T",
                "M",
                "N",
                3
        )
        questionList.add(que14)

        val que15 = Questions(
                15,
                "What does this sign represent?",
                R.drawable.o_letter,
                "R",
                "O",
                "T",
                2
        )
        questionList.add(que15)

        val que16 = Questions(
                16,
                "What does this sign represent?",
                R.drawable.p_letter,
                "P",
                "K",
                "B",
                1
        )
        questionList.add(que16)

        val que17 = Questions(
                17,
                "What does this sign represent?",
                R.drawable.q_letter,
                "D",
                "W",
                "Q",
                3
        )
        questionList.add(que17)

        val que18 = Questions(
                18,
                "What does this sign represent?",
                R.drawable.r_letter,
                "N",
                "R",
                "U",
                2
        )
        questionList.add(que18)

        val que19 = Questions(
                19,
                "What does this sign represent?",
                R.drawable.s_letter,
                "A",
                "P",
                "S",
                3
        )
        questionList.add(que19)

        val que20 = Questions(
                20,
                "What does this sign represent?",
                R.drawable.t_letter,
                "T",
                "M",
                "N",
                1
        )
        questionList.add(que20)

        val que21 = Questions(
                21,
                "What does this sign represent?",
                R.drawable.u_letter,
                "Z",
                "P",
                "U",
                3
        )
        questionList.add(que21)

        val que22 = Questions(
                22,
                "What does this sign represent?",
                R.drawable.v_letter,
                "K",
                "V",
                "L",
                2
        )
        questionList.add(que22)

        val que23 = Questions(
                23,
                "What does this sign represent?",
                R.drawable.w_letter,
                "W",
                "V",
                "N",
                1
        )
        questionList.add(que23)

        val que24 = Questions(
                24,
                "What does this sign represent?",
                R.drawable.x_letter,
                "E",
                "R",
                "X",
                3
        )
        questionList.add(que24)

        val que25 = Questions(
                25,
                "What does this sign represent?",
                R.drawable.y_letter,
                "Y",
                "B",
                "U",
                1
        )
        questionList.add(que25)

        val que26 = Questions(
                26,
                "What does this sign represent?",
                R.drawable.z_letter,
                "T",
                "Z",
                "J",
                2
        )
        questionList.add(que26)


        questionList.shuffle()
        return questionList
    }

    fun getNumQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
                1,
                "What does this sign represent?",
                R.drawable.one_num,
                "5",
                "1",
                "7",
                2
        )
        questionList.add(que1)

        val que2 = Questions(
                2,
                "What does this sign represent?",
                R.drawable.two_num,
                "2",
                "4",
                "8",
                1
        )
        questionList.add(que2)

        val que3 = Questions(
                3,
                "What does this sign represent?",
                R.drawable.three_num,
                "5",
                "6",
                "3",
                3
        )
        questionList.add(que3)

        val que4 = Questions(
                4,
                "What does this sign represent?",
                R.drawable.four_num,
                "9",
                "4",
                "3",
                2
        )
        questionList.add(que4)

        val que5 = Questions(
                5,
                "What does this sign represent?",
                R.drawable.five_num,
                "5",
                "10",
                "7",
                1
        )
        questionList.add(que5)

        val que6 = Questions(
                6,
                "What does this sign represent?",
                R.drawable.six_num,
                "8",
                "3",
                "6",
                3
        )
        questionList.add(que6)

        val que7 = Questions(
                7,
                "What does this sign represent?",
                R.drawable.seven_num,
                "5",
                "1",
                "7",
                3
        )
        questionList.add(que7)

        val que8 = Questions(
                8,
                "What does this sign represent?",
                R.drawable.one_num,
                "9",
                "8",
                "3",
                2
        )
        questionList.add(que1)

        val que9 = Questions(
                9,
                "What does this sign represent?",
                R.drawable.nine_num,
                "9",
                "3",
                "8",
                1
        )
        questionList.add(que9)

        val que10 = Questions(
                10,
                "What does this sign represent?",
                R.drawable.tn_num,
                "7",
                "1",
                "10",
                3
        )
        questionList.add(que10)



        questionList.shuffle()
        return questionList
    }
}