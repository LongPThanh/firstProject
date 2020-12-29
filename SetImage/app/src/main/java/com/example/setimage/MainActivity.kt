package com.example.setimage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val subject : List<String> = listOf("IOS","Android","PHP","React")
//        listView.adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,subject)
//    }
//}
        var mySubject: List<String> = listOf("IOS", "LOL", "Android", "PHP", "React")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mySubject)
    }
}




















