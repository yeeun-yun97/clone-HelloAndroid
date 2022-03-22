package com.github.yeeun_yun97.clone.HelloAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.Toast

class LifeCycleActivity : AppCompatActivity() {
    val TAG : String = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.i(TAG,"onCreate")
        //액티비티를 생성할 때-> 온 스타트 호출.
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
        //다른 액티비티 갔다가 다시 돌아왔을 때-> 온 스타트 호출.
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
        //액티비티가 시작되었을 때-> 온 리줌 호출.
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
        //이 액티비티가 화면에 보여질 때. 사용자와 상호작용이 가능.
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause")
        //다른 액티비티가 활성화 될 때. 사용자와 상호작용이 안됨.-> 온 스탑 호출.
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
        //액티비티가 화면에서 사라질 때
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
        //액티비티가 종료되거나 시스템에 의해 제거될 때.
    }
}