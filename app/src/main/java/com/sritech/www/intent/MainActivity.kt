package com.sritech.www.intent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener{
            var i=Intent()
            i.action=Intent.ACTION_DIAL
            //i.action="android.media.action.IMAGE_CAPTURE"
            //i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("tel:"+edt1.text.toString())

            //i.action=Intent.ACTION_VIEW
           // i.data=Uri.parse("https://"+edt1.text.toString())
            //i.putExtra("email",edt1.text.toString())

            /*for audio files explorer*/
           // i.action=Intent.ACTION_GET_CONTENT
            //i.type="audio/*"

            startActivity(i)
        }
        b2.setOnClickListener{

            var i=Intent(this@MainActivity,Welcome::class.java)
            i.putExtra("name",edt2.text.toString())
            i.putExtra("email",edt3.text.toString())
            startActivity(i)

        }
        b3.setOnClickListener {

            var i = packageManager.getLaunchIntentForPackage("com.whatsapp&hl=en")
            if (i != null)
                startActivity(i)
            else {
                var i = Intent()
                i.action = Intent.ACTION_VIEW
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp&hl=en")
                startActivity(i)
            }
        }
    }
}
