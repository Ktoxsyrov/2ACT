package com.example.ht2

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    final val DIALOG = 1

    override fun onResume() {
        Log.d("Second Activity: ", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Second Activity: ", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Second Activity: ", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Second Activity: ", "onDestroy")
        super.onDestroy()
    }

    fun openDialog(view: View) {
        val builder = AlertDialog.Builder(view.context)
        builder.setTitle("Alert Dialog")
        builder.setMessage("Message")
        builder.show()
    }


}