package com.drawbytess.aslbasics

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*


class QuizQuestions : AppCompatActivity(), View.OnClickListener {

    private var aCurrentPosition: Int = 1
    private var aQuestionList: ArrayList<Questions>? = null
    private var aSelectedOptionPosition: Int = 0
    private var aCorrectAnswers: Int = 0
    private var aUserName: String? = null

    // App functionality
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        aUserName = intent.getStringExtra(Constants.USER_NAME)

        aQuestionList = Constants.getQuestions()

        setQuestion()

        tv_opt1.setOnClickListener(this)
        tv_opt2.setOnClickListener(this)
        tv_opt3.setOnClickListener(this)

        btn_submit.setOnClickListener(this)
    }

    // Give values to the answer options
    private fun defaultOptView() {
        val opts = ArrayList<TextView>()
        opts.add(0, tv_opt1)
        opts.add(1, tv_opt2)
        opts.add(2, tv_opt3)

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
    private fun setQuestion() {
        val question = aQuestionList!![aCurrentPosition - 1]

        defaultOptView()

        if (aCurrentPosition == 10) {
            btn_submit.text = "FINISH"
        } else {
            btn_submit.text = "SUBMIT"
        }
        // Sets up progress bar and side text
        progressBar.progress = aCurrentPosition
        tv_progress.text = "${aCurrentPosition}/${progressBar.max}"

        // set the question equal to id
        tv_question.text = question!!.questions

        // set image
        iv_sign.setImageResource(question.image)

        // set text
        tv_opt1.text = question.opt1
        tv_opt2.text = question.opt2
        tv_opt3.text = question.opt3
    }

    // Sets up click actions
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_opt1 -> {
                selectedOptionView(tv_opt1, 1)
            }
            R.id.tv_opt2 -> {
                selectedOptionView(tv_opt2, 2)
            }
            R.id.tv_opt3 -> {
                selectedOptionView(tv_opt3, 3)
            }
            R.id.btn_submit ->{
                if(aSelectedOptionPosition == 0){
                    aCurrentPosition++

                    when{
                        aCurrentPosition <= 10 ->{

                            setQuestion()
                            tv_opt1.isClickable = true
                            tv_opt2.isClickable = true
                            tv_opt3.isClickable = true

                        } else ->{
                        val intent = Intent(this, Results::class.java)
                        intent.putExtra(Constants.USER_NAME, aUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, aCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS, 10)
                        startActivity(intent)
                        finish()
                    }
                    }
                } else {
                    val question = aQuestionList?.get(aCurrentPosition - 1)


                    if (question!!.correctAnswer != aSelectedOptionPosition) {
                        answerView(aSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        tv_opt1.isClickable = false
                        tv_opt2.isClickable = false
                        tv_opt3.isClickable = false
                    } else {
                        aCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    tv_opt1.isClickable = false
                    tv_opt2.isClickable = false
                    tv_opt3.isClickable = false

                    if (aCurrentPosition == 10) {
                        btn_submit.text = "FINISH"
                    } else {
                        btn_submit.text = "GO TO NEXT QUESTION"
                    }
                    aSelectedOptionPosition = 0
                }
            }
        }
    }

    // Responsible for answer colors
    private fun answerView(answer: Int, drawablesView: Int){
        when(answer){
            1 -> {
                tv_opt1.background = ContextCompat.getDrawable(
                    this, drawablesView
                )
            }
            2 -> {
                tv_opt2.background = ContextCompat.getDrawable(
                    this, drawablesView
                )
            }
            3 -> {
                tv_opt3.background = ContextCompat.getDrawable(
                    this, drawablesView
                )
            }
        }
    }

    // Function that tells the app what the options should look like if selected
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){

        defaultOptView()
        aSelectedOptionPosition = selectedOptionNum

        tv.setTextColor((Color.parseColor("#363A43")))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.select_option_border_bg
        )
    }
}