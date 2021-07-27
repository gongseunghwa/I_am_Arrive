package com.example.allivev2

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        HelpButton.setOnClickListener{
            Log.d("Log","HelpMe button is Clicked")
            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
    }
}