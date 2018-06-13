package com.clickbubble

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.Button
import android.graphics.Color
import android.view.View
import android.R.attr.y
import android.R.attr.x
import android.content.Intent
import java.util.*
import android.util.DisplayMetrics
import android.widget.AbsoluteLayout
import kotlinx.android.synthetic.main.activity_button_example.*


class ButtonIn : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_button_example)
//        val button = findViewById<View>(R.id.my_button) as Button
//        val absParams = button.layoutParams as AbsoluteLayout.LayoutParams
//
//        val displaymetrics = DisplayMetrics()
//        windowManager.defaultDisplay.getMetrics(displaymetrics)
//        val width = displaymetrics.widthPixels
//        val height = displaymetrics.heightPixels
//
//
//        val r = Random()
//
//        absParams.x = r.nextInt(width)
//        absParams.y = r.nextInt(height)
//        button.layoutParams = absParams
//
//            my_button.setOnClickListener( {
//              val intent = Intent(this, ButtonIn::class.java)
////                startActivity(intent)
//
//            })
            val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
            val button = Button(this)
//            val absParams = button.layoutParams as AbsoluteLayout.LayoutParams

//        val displaymetrics = DisplayMetrics()
//        windowManager.defaultDisplay.getMetrics(displaymetrics)
//        val width = displaymetrics.widthPixels
//        val height = displaymetrics.heightPixels
//
//
//        val r = Random()
//
//        absParams.x = r.nextInt(width)
//        absParams.y = r.nextInt(height)
//        button.layoutParams = absParams

            button.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
                button.text = "Click me"
                button.setOnClickListener(View.OnClickListener {
                    button.text = "You just clicked me"
                })
        button.setBackgroundColor(Color.GREEN)
        button.setTextColor(Color.RED)
        constraintLayout.addView(button)
    }
}