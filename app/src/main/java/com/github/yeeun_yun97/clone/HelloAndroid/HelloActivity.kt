package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTextView: TextView = findViewById(R.id.my_textview)
        val greetingMsg = resources.getText(R.string.greeting).toString()
        val redColor = ContextCompat.getColor(applicationContext, R.color.red)

        var myEdittext = findViewById<EditText>(R.id.my_edittext)
        var myButton = findViewById<Button>(R.id.my_btn)

        //인자가 하나인 추상 메서드의 경우, 파라미터 이름도 안 정하고 it라는 이름으로 사용하여 아주 극적으로 코드를 줄일 수 있다.
        myButton.setOnClickListener {
            var btnLabel = (it as Button).text
            Toast.makeText(applicationContext, "button Label : ${btnLabel}", Toast.LENGTH_LONG)
                .show()
        }

        //클래식한 방법.
        myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var btnLabel = (v as Button).text
                Toast.makeText(applicationContext, "button Label : ${btnLabel}", Toast.LENGTH_LONG)
                    .show()
            }
        })


    }
}