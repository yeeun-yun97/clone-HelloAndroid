package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LogCatAndToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_cat_and_toast)

        Log.v("tag_name1", "Verbose Message")//일반 메시지
        Log.d("tag_name2", "Debug Message")//디버깅 메시지
        Log.i("tag_name3", "Info Message")//정보 표기용 메시지
        Log.w("tag_name4", "Warning Message")//경고 메시지
        Log.e("tag_name5", "Error Message")//에러 발생 메시지



    }
}