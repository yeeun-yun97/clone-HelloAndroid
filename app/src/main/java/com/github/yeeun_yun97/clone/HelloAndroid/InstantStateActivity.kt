package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InstantStateActivity : AppCompatActivity() {
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instant_state)

        var numberTextview=findViewById<TextView>(R.id.numberTextview)
        var numberEdittext=findViewById<EditText>(R.id.numberEdittext)
        var increaseButton = findViewById<Button>(R.id.increaseButton)
        var setNumberButton = findViewById<Button>(R.id.setNumberButton)

        numberTextview.text= num.toString()

        increaseButton.setOnClickListener{
            num=numberTextview.text.toString().toInt()+1
            numberTextview.text=num.toString()
        }
        setNumberButton.setOnClickListener {
            num=numberEdittext.text.toString().toInt()
            numberTextview.text=num.toString()
        }
    }
}