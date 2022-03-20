package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTextView : TextView = findViewById(R.id.my_textview)
        val greetingMsg = resources.getText(R.string.greeting).toString()
        val redColor = ContextCompat.getColor(applicationContext, R.color.red)


    }
}