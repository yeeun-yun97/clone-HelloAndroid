package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTextView: TextView = findViewById(R.id.my_textview)
        val greetingMsg = resources.getText(R.string.greeting).toString()
        val redColor = ContextCompat.getColor(applicationContext, R.color.red)

        var myEdittext = findViewById<EditText>(R.id.my_edittext)
        var myButton = findViewById<Button>(R.id.my_btn)

        myButton.setOnClickListener {
            var btnLabel = (it as Button).text
            Toast.makeText(applicationContext, "button Label : ${btnLabel}", Toast.LENGTH_LONG)
                .show()
        }

        myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var btnLabel = (v as Button).text
                Toast.makeText(applicationContext, "button Label : ${btnLabel}", Toast.LENGTH_LONG)
                    .show()
            }
        })


    }
}