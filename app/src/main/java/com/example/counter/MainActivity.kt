package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var countOfDays: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabAddDay.setOnClickListener {
            countOfDays++
            updateProgress()
        }
    }

    private fun updateProgress() {
        tvCount.text = countOfDays.toString()
        pbStatus.secondaryProgress = countOfDays
    }
}