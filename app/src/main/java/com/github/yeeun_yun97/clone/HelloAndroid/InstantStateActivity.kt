package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InstantStateActivity : AppCompatActivity() {
    private var num = 0
    private lateinit var numberTextview: TextView
    private lateinit var numberEdittext: EditText
    private lateinit var increaseButton: Button
    private lateinit var setNumberButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instant_state)

        numberTextview = findViewById(R.id.numberTextview)
        numberEdittext = findViewById(R.id.numberEdittext)
        increaseButton = findViewById(R.id.increaseButton)
        setNumberButton = findViewById(R.id.setNumberButton)

        if(savedInstanceState!=null){
             num=savedInstanceState.getInt("num")
        }
        numberTextview.text = num.toString()

        increaseButton.setOnClickListener {
            num = numberTextview.text.toString().toInt() + 1
            numberTextview.text = num.toString()
        }
        setNumberButton.setOnClickListener {
            num = numberEdittext.text.toString().toInt()
            numberTextview.text = num.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //onStop 이전에 호출됨.

        outState.putInt("num", num)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        //onStart 이후에 호출됨.

        num = savedInstanceState.getInt("num") ?:0
        numberTextview.text = num.toString()
    }
}