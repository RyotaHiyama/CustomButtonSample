package com.nokopi.custombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customBtn: MyCustomButton = findViewById(R.id.customBtn)
        customBtn.setOnClickListener {
            //ボタン押したときの処理
        }
    }
}