package com.example.aslbasics

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_numbers_quiz.*

class NumbersQuiz : AppCompatActivity(), View.OnClickListener {

    private var nCurrentPosition: Int = 1
    private var nQuestionList: ArrayList<Questions>? = null
    private var nSelectedOptionPosition: Int = 0
    private var nCorrectAnswers: Int = 0
    private var nUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers_quiz)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        nUserName = intent.getStringExtra(Constants.USER_NAME)

        nQuestionList = Constants.getNumQuestions()

        setNumQuestion()

        tv_num_opt1.setOnClickListener(this)
        tv_num_opt2.setOnClickListener(this)
        tv_num_opt3.setOnClickListener(this)

        btn_num_submit.setOnClickListener(this)
    }

    // Give values to the answer options
    private fun defaultNumOptView() {
        val opts = ArrayList<TextView>()
        opts.add(0, tv_num_opt1)
        opts.add(1, tv_num_opt2)
        opts.add(2, tv_num_opt3)

        for (opt in opts){
            opt.setTextColor((Color.parseColor("#7A8089")))
            opt.typeface = Typeface.DEFAULT
            opt.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_border_bg
            )
        }
    }

    // Sets up the questions
    private fun setNumQuestion() {
        val question = nQuestionList!![nCurrentPosition - 1]

        defaultNumOptView()

        if (nCurrentPosition == 10) {
            btn_num_submit.text = "FINISH"
        } else {
            btn_num_submit.text = "SUBMIT"
        }
        // Sets up progress bar and side text
        progressNumBar.progress = nCurrentPosition
        tv_progress_num.text = "${nCurrentPosition}/${progressNumBar.max}"

        // set the question equal to id
        tv_num_question.text = question!!.questions

        // set image
        iv_num_sign.setImageResource(question.image)

        // set text
        tv_num_opt1.text = question.opt1
        tv_num_opt2.text = question.opt2
        tv_num_opt3.text = question.opt3
    }

    // Sets up click actions
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_num_opt1 -> {
                selectedNumOptionView(tv_num_opt1, 1)
            }
            R.id.tv_num_opt2 -> {
                selectedNumOptionView(tv_num_opt2, 2)
            }
            R.id.tv_num_opt3 -> {
                selectedNumOptionView(tv_num_opt3, 3)
            }
            R.id.btn_num_submit ->{
                if(nSelectedOptionPosition == 0){
                    nCurrentPosition++

                    when{
                        nCurrentPosition <= 10 ->{

                            setNumQuestion()
                            tv_num_opt1.isClickable = true
                            tv_num_opt2.isClickable = true
                            tv_num_opt3.isClickable = true

                        } else ->{
                        val intent = Intent(this, Results::class.java)
                        intent.putExtra(Constants.USER_NAME, nUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, nCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS, 10)
                        startActivity(intent)
                        finish()
                    }
                    }
                } else {
                    val question = nQuestionList?.get(nCurrentPosition - 1)


                    if (question!!.correctAnswer != nSelectedOptionPosition) {
                        answerNumView(nSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        tv_num_opt1.isClickable = false
                        tv_num_opt2.isClickable = false
                        tv_num_opt3.isClickable = false
                    } else {
                        nCorrectAnswers++
                    }
                    answerNumView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    tv_num_opt1.isClickable = false
                    tv_num_opt2.isClickable = false
                    tv_num_opt3.isClickable = false

                    if (nCurrentPosition == 10) {
                        btn_num_submit.text = "FINISH"
                    } else {
                        btn_num_submit.text = "GO TO NEXT QUESTION"
                    }
                    nSelectedOptionPosition = 0
                }
            }
        }
    }

    // Responsible for answer colors
    private fun answerNumView(answer: Int, drawablesView: Int){
        when(answer){
            1 -> {
                tv_num_opt1.background = ContextCompat.getDrawable(
                        this, drawablesView
                )
            }
            2 -> {
                tv_num_opt2.background = ContextCompat.getDrawable(
                        this, drawablesView
                )
            }
            3 -> {
                tv_num_opt3.background = ContextCompat.getDrawable(
                        this, drawablesView
                )
            }
        }
    }

    // Function that tells the app what the options should look like if selected
    private fun selectedNumOptionView(tv: TextView, selectedOptionNum: Int){

        defaultNumOptView()
        nSelectedOptionPosition = selectedOptionNum

        tv.setTextColor((Color.parseColor("#363A43")))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.select_option_border_bg
        )
    }
}