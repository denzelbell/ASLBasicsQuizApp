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
            R.drawable.ivl_a,
            "S",
            "G",
            "A",
            3
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What does this sign represent?",
            R.drawable.ivl_b,
            "J",
            "B",
            "L",
            2
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What does this sign represent?",
            R.drawable.ivl_c,
            "C",
            "I",
            "H",
            1
        )
        questionList.add(que3)

        val que4 = Questions(
            4,
            "What does this sign represent?",
            R.drawable.ivl_d,
            "O",
            "D",
            "F",
            2
        )
        questionList.add(que4)

        val que5 = Questions(
            5,
            "What does this sign represent?",
            R.drawable.ivl_e,
            "T",
            "Y",
            "E",
            3
        )
        questionList.add(que5)

        val que6 = Questions(
            6,
            "What does this sign represent?",
            R.drawable.ivl_f,
            "K",
            "F",
            "G",
            2
        )
        questionList.add(que6)

        val que7 = Questions(
            7,
            "What does this sign represent?",
            R.drawable.ivl_g,
            "G",
            "U",
            "H",
            1
        )
        questionList.add(que7)

        val que8 = Questions(
            8,
            "What does this sign represent?",
            R.drawable.ivl_h,
            "L",
            "H",
            "G",
            2
        )
        questionList.add(que8)

        val que9 = Questions(
            9,
            "What does this sign represent?",
            R.drawable.ivl_i,
            "O",
            "P",
            "I",
            3
        )
        questionList.add(que9)

        val que10 = Questions(
            10,
            "What does this sign represent?",
            R.drawable.ivl_j,
            "J",
            "Q",
            "W",
            1
        )
        questionList.add(que10)

        val que11 = Questions(
            11,
            "What does this sign represent?",
            R.drawable.ivl_k,
            "N",
            "K",
            "B",
            2
        )
        questionList.add(que11)

        val que12 = Questions(
            12,
            "What does this sign represent?",
            R.drawable.ivl_l,
            "A",
            "O",
            "L",
            3
        )
        questionList.add(que12)

        val que13 = Questions(
            13,
            "What does this sign represent?",
            R.drawable.ivl_m,
            "M",
            "T",
            "N",
            1
        )
        questionList.add(que13)

        val que14 = Questions(
            14,
            "What does this sign represent?",
            R.drawable.ivl_n,
            "T",
            "M",
            "N",
            3
        )
        questionList.add(que14)

        val que15 = Questions(
            15,
            "What does this sign represent?",
            R.drawable.ivl_o,
            "R",
            "O",
            "T",
            2
        )
        questionList.add(que15)

        val que16 = Questions(
            16,
            "What does this sign represent?",
            R.drawable.ivl_p,
            "P",
            "K",
            "B",
            1
        )
        questionList.add(que16)

        val que17 = Questions(
            17,
            "What does this sign represent?",
            R.drawable.ivl_q,
            "D",
            "W",
            "Q",
            3
        )
        questionList.add(que17)

        val que18 = Questions(
            18,
            "What does this sign represent?",
            R.drawable.ivl_r,
            "N",
            "R",
            "U",
            2
        )
        questionList.add(que18)

        val que19 = Questions(
            19,
            "What does this sign represent?",
            R.drawable.ivl_s,
            "A",
            "P",
            "S",
            3
        )
        questionList.add(que19)

        val que20 = Questions(
            20,
            "What does this sign represent?",
            R.drawable.ivl_t,
            "T",
            "M",
            "N",
            1
        )
        questionList.add(que20)

        val que21 = Questions(
            21,
            "What does this sign represent?",
            R.drawable.ivl_u,
            "Z",
            "P",
            "U",
            3
        )
        questionList.add(que21)

        val que22 = Questions(
            22,
            "What does this sign represent?",
            R.drawable.ivl_v,
            "K",
            "V",
            "L",
            2
        )
        questionList.add(que22)

        val que23 = Questions(
            23,
            "What does this sign represent?",
            R.drawable.ivl_w,
            "W",
            "V",
            "N",
            1
        )
        questionList.add(que23)

        val que24 = Questions(
            24,
            "What does this sign represent?",
            R.drawable.ivl_x,
            "E",
            "R",
            "X",
            3
        )
        questionList.add(que24)

        val que25 = Questions(
            25,
            "What does this sign represent?",
            R.drawable.ivl_y,
            "Y",
            "B",
            "U",
            1
        )
        questionList.add(que25)

        val que26 = Questions(
            26,
            "What does this sign represent?",
            R.drawable.ivl_z,
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
            R.drawable.ivn_1,
            "11",
            "6",
            "1",
            3
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What does this sign represent?",
            R.drawable.ivn_2,
            "4",
            "12",
            "2",
            3
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What does this sign represent?",
            R.drawable.ivn_3,
            "3",
            "6",
            "13",
            1
        )
        questionList.add(que3)

        val que4 = Questions(
            4,
            "What does this sign represent?",
            R.drawable.ivn_4,
            "9",
            "3",
            "4",
            3
        )
        questionList.add(que4)

        val que5 = Questions(
            5,
            "What does this sign represent?",
            R.drawable.ivn_5,
            "15",
            "5",
            "55",
            1
        )
        questionList.add(que5)

        val que6 = Questions(
            6,
            "What does this sign represent?",
            R.drawable.ivn_6,
            "9",
            "6",
            "16",
            2
        )
        questionList.add(que6)

        val que7 = Questions(
            7,
            "What does this sign represent?",
            R.drawable.ivn_7,
            "7",
            "77",
            "8",
            1
        )
        questionList.add(que7)

        val que8 = Questions(
            8,
            "What does this sign represent?",
            R.drawable.ivn_8,
            "7",
            "4",
            "8",
            3
        )
        questionList.add(que8)

        val que9 = Questions(
            9,
            "What does this sign represent?",
            R.drawable.ivn_9,
            "3",
            "9",
            "6",
            2
        )
        questionList.add(que9)

        val que10 = Questions(
            10,
            "What does this sign represent?",
            R.drawable.ivn_10,
            "10",
            "20",
            "1",
            1
        )
        questionList.add(que10)

        val que11 = Questions(
            11,
            "What does this sign represent?",
            R.drawable.ivn_11,
            "1",
            "8",
            "11",
            3
        )
        questionList.add(que11)

        val que12 = Questions(
            12,
            "What does this sign represent?",
            R.drawable.ivn_12,
            "12",
            "2",
            "22",
            1
        )
        questionList.add(que12)

        val que13 = Questions(
            13,
            "What does this sign represent?",
            R.drawable.ivn_13,
            "3",
            "13",
            "33",
            2
        )
        questionList.add(que13)

        val que14 = Questions(
            14,
            "What does this sign represent?",
            R.drawable.ivn_14,
            "14",
            "4",
            "44",
            1
        )
        questionList.add(que14)

        val que15 = Questions(
            15,
            "What does this sign represent?",
            R.drawable.ivn_15,
            "5",
            "15",
            "55",
            2
        )
        questionList.add(que15)

        val que16 = Questions(
            16,
            "What does this sign represent?",
            R.drawable.ivn_16,
            "6",
            "5",
            "16",
            3
        )
        questionList.add(que16)

        val que17 = Questions(
            17,
            "What does this sign represent?",
            R.drawable.ivn_17,
            "18",
            "17",
            "16",
            2
        )
        questionList.add(que17)

        val que18 = Questions(
            18,
            "What does this sign represent?",
            R.drawable.ivn_18,
            "17",
            "15",
            "18",
            3
        )
        questionList.add(que18)

        val que19 = Questions(
            19,
            "What does this sign represent?",
            R.drawable.ivn_19,
            "19",
            "9",
            "16",
            1
        )
        questionList.add(que19)

        val que20 = Questions(
            20,
            "What does this sign represent?",
            R.drawable.ivn_20,
            "8",
            "20",
            "10",
            3
        )
        questionList.add(que20)

        questionList.shuffle()
        return questionList
    }

    fun getFeelQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What does this sign represent?",
            R.drawable.ivfe_funny,
            "Tired",
            "Funny",
            "Love",
            2
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What does this sign represent?",
            R.drawable.ivfe_good,
            "Good",
            "Bad",
            "Sick",
            1
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What does this sign represent?",
            R.drawable.ivfe_happy,
            "Sad",
            "Mad",
            "Happy",
            3
        )
        questionList.add(que3)

        val que4 = Questions(
            4,
            "What does this sign represent?",
            R.drawable.ivfe_like,
            "Scared",
            "Like",
            "Boring",
            2
        )
        questionList.add(que4)

        val que5 = Questions(
            5,
            "What does this sign represent?",
            R.drawable.ivfe_love,
            "Love",
            "Sick",
            "Like",
            1
        )
        questionList.add(que5)

        val que6 = Questions(
            6,
            "What does this sign represent?",
            R.drawable.ivfe_mad,
            "Funny",
            "Scared",
            "Mad",
            3
        )
        questionList.add(que6)

        val que7 = Questions(
            7,
            "What does this sign represent?",
            R.drawable.ivfe_sad,
            "Sad",
            "Mad",
            "Cry",
            1
        )
        questionList.add(que7)

        val que8 = Questions(
            8,
            "What does this sign represent?",
            R.drawable.ivfe_scared,
            "Mad",
            "Scared",
            "Boring",
            2
        )
        questionList.add(que8)

        val que9 = Questions(
            9,
            "What does this sign represent?",
            R.drawable.ivfe_sick,
            "Sick",
            "Sad",
            "Scared",
            1
        )
        questionList.add(que9)

        val que10 = Questions(
            10,
            "What does this sign represent?",
            R.drawable.ivfe_tired,
            "Sad",
            "Scared",
            "Tired",
            3
        )
        questionList.add(que10)


        questionList.shuffle()
        return questionList
    }

    fun getPeopleQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What does this sign represent?",
            R.drawable.ivp_baby,
            "Boy",
            "Baby",
            "Littlw",
            2
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What does this sign represent?",
            R.drawable.ivp_boy,
            "Man",
            "Friend",
            "Boy",
            3
        )
        questionList.add(que2)

        val que3 = Questions(
            3,
            "What does this sign represent?",
            R.drawable.ivp_brother,
            "Sister",
            "Brother",
            "Boy",
            2
        )
        questionList.add(que3)

        val que4 = Questions(
            4,
            "What does this sign represent?",
            R.drawable.ivp_father,
            "Father",
            "Mother",
            "Sister",
            1
        )
        questionList.add(que4)

        val que5 = Questions(
            5,
            "What does this sign represent?",
            R.drawable.ivp_friend,
            "Teacher",
            "Friend",
            "Father",
            2
        )
        questionList.add(que5)

        val que6 = Questions(
            6,
            "What does this sign represent?",
            R.drawable.ivp_girl,
            "Sister",
            "Mother",
            "Girl",
            3
        )
        questionList.add(que6)

        val que7 = Questions(
            7,
            "What does this sign represent?",
            R.drawable.ivp_man,
            "Man",
            "Boy",
            "Father",
            1
        )
        questionList.add(que7)

        val que8 = Questions(
            8,
            "What does this sign represent?",
            R.drawable.ivp_mother,
            "Girl",
            "Mother",
            "Woman",
            2
        )
        questionList.add(que8)

        val que9 = Questions(
            9,
            "What does this sign represent?",
            R.drawable.ivp_sister,
            "Sister",
            "Woman",
            "Brother",
            1
        )
        questionList.add(que9)

        val que10 = Questions(
            10,
            "What does this sign represent?",
            R.drawable.ivp_teacher,
            "Judge",
            "Teacher",
            "Coach",
            2
        )
        questionList.add(que10)

        val que11 = Questions(
            11,
            "What does this sign represent?",
            R.drawable.ivp_woman,
            "Girl",
            "Mother",
            "Woman",
            3
        )
        questionList.add(que11)


        questionList.shuffle()
        return questionList
    }
}