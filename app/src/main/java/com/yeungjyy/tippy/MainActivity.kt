package com.yeungjyy.tippy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // The onCreate() function will be automatically called when this class is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Import the main activity UI contents from the res/layout/activity_main.xml file
        setContentView(R.layout.activity_main)
    }
}