package com.sritech.www.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var n=intent.getStringExtra("name")
        var e=intent.getStringExtra("email")
        txt1.setText("Welcome :$n $e")

    }
}
