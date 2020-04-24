package com.example.musicplayershax

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        kissImgId.setOnClickListener {
            kissImgId.setBackgroundColor(Color.GRAY)
            calcImageId.setBackgroundColor(Color.MAGENTA)
        }

    }
}
