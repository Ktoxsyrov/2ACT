package com.example.ht2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("First Activity: ", "onCreate")
        setContentView(R.layout.activity_main)
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        Log.d("First Activity: ", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("First Activity: ", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("First Activity: ", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("First Activity: ", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("First Activity: ", "onDestroy")
        super.onDestroy()
    }

}