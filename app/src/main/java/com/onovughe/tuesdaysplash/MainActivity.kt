package com.onovughe.tuesdaysplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sampleImages: IntArray = intArrayOf(
        R.drawable.img1,
        R.drawable.img12,
        R.drawable.img14,
        R.drawable.img15,
        R.drawable.img19
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sliderShow.pageCount
        sliderShow.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }
        
        sliderShow.setImageClickListener { position ->
            Toast.makeText(applicationContext,"", Toast.LENGTH_LONG).show()
        }

        //step 1 open gradle:module
        //step 2 XML
        //step 3 main activity code
    }
}