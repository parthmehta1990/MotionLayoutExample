package com.motion.motionlayoutexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    /*To avoid this add kotlin extensions in app's build.gradle file*/
    //var button1: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // button1=findViewById(R.id.button1)
        button1!!.setOnClickListener(this@MainActivity)

    }

    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.button1->{
                var intent:Intent =Intent(this@MainActivity,Scrollheader::class.java)
                startActivity(intent)
            }
        }
    }
}