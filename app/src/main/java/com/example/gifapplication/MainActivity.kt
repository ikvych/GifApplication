package com.example.gifapplication

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.FrameLayout
import androidx.core.graphics.ColorUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_left.setOnClickListener {
            gv_gif.startAnim()
        }
        b_right.setOnClickListener {
            gv_gif.stopAnim()
        }
        b_change.setOnClickListener {
            /*gv_gif.cycleDuration = 8000*/
        }
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            gv_gif.aspectRationMode = GifView2.AspectRatioMode.WIDTH_MODE
        } else{
            gv_gif.aspectRationMode = GifView2.AspectRatioMode.HEIGHT_MODE
        }
    }
}