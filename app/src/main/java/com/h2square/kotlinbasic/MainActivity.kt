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

        //문법연습용
        val myName : String //value
        var myAge : Int //variable
        myName ="이정빈"

        var haetae ="ddddd"
        val ssss= 1
        val ssssww= "sss"
        myAge=12
        myAge=2
        println(myAge)
    Log.d("변수", myName)
//조건문
        val usrAge =15
        if(usrAge >= 20){
            Log.d("성인 판별","성인입니다")
        }
        else if (usrAge>=17){
            Log.d("성인 판별","고딩입니다.")
        }  else if (usrAge>=14){
            Log.d("성인 판별","중딩입니다.")
        }
        else{
            Log.d("성인 ㅠㅏㄴ병","성인아닙니다.")
        }
val userAge =25
        if (usrAge>=20){
            Log.d("성인판별","성인입니다")
        }
        else{
            Log.d("성인판별","tjddlsdkslqslek")
        }
        clickBtn.setOnClickListener {
    Log.d( "메인화면로그","클릭용 버튼 눌림")
            Log.e("메인화면로그","에러임")
        }
        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼이 눌림", Toast.LENGTH_SHORT).show()
        }
    }
}