package com.websarva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_hello_sample)
    }

/*
    ///
    /// 参考URL:https://www.programming-shimomura.com/2018/02/24/%E3%80%90android-kotlin%E3%80%91onclicklistener%E8%A8%AD%E5%AE%9A%E4%B8%80%E8%A6%A7/
    ///
    fun buttonClickEvent(view: View) {
        Log.d("MainActivity", "button click")
    }
*/
    private class HelloListenerimplements View.OnClickListener{
        @Override
        public void onClick(view view) {
        }
    }

}
