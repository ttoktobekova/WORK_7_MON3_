package com.example.work_7_mon3_

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).circleCrop().into(this)
}