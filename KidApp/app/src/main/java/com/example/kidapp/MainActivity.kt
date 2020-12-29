package com.example.kidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnadd.setOnClickListener {
            if (et1.text.toString().isNotEmpty() && et2.text.toString().isNotEmpty()) {
                var number1: Int = (et1.text.toString()).toInt()
                var number2: Int = (et2.text.toString()).toInt()
                tv.text = (number1 + number2).toString()}else{
                    Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show()
                }
            }
        btnSubtract.setOnClickListener {
            if (et1.text.toString().isNotEmpty() && et2.text.toString().isNotEmpty()) {
                var number1: Int = (et1.text.toString()).toInt()
                var number2: Int = (et2.text.toString()).toInt()
                tv.text = (number1 - number2).toString()}else{
                    Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show()
            }
        }
        btnMultiply.setOnClickListener {
            if (et1.text.toString().isNotEmpty() && et2.text.toString().isNotEmpty()) {
                var number1: Int = (et1.text.toString()).toInt()
                var number2: Int = (et2.text.toString()).toInt()
                tv.text = (number1 * number2).toString()}else{
                Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show()
            }
        }

        btnDevide.setOnClickListener {
            if (et1.text.toString().isNotEmpty() && et2.text.toString().isNotEmpty()) {
                var number1: Int = (et1.text.toString()).toInt()
                var number2: Int = (et2.text.toString()).toInt()
                try {
                    tv.text = (number1 / number2).toString()
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, "ErrorDevide", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}