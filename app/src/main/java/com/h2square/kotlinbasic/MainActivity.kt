package com.h2square.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn event
        okBtn.setOnClickListener {
            //입력된내용 변수저장
            //저장입력값 텍스트 뷰로 바꿈

            val inputContent =contentEdt.text.toString()

            resultTxt.text= inputContent

        }


    }
}