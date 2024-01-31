package com.example.work_7_mon3_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.work_7_mon3_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.layout_frameActivity,FirstFragment()).commit()
        }
    }
}