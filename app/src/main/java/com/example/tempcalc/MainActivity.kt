package com.example.tempcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.calc)
        var temp: EditText = findViewById(R.id.etTemp)
        var show : TextView = findViewById(R.id.tvshow)

        btn.setOnClickListener()
        {
            var a : Int = temp.text.toString().toInt()
            var ans : Float =(a*1.8F)+32
            show.text =  ans.toString() + " ℉"

        }
    }

}