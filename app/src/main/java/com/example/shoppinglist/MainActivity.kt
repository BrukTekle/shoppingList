package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView2.setOnClickListener {
            val eIntent=Intent(this,beauty::class.java)
            eIntent.putExtra("type","electronics")
            startActivity(eIntent)
        }
        imageView.setOnClickListener {
            val eIntent=Intent(this,beauty::class.java)
            eIntent.putExtra("type","cloth")
            startActivity(eIntent)
        }
        imageView3.setOnClickListener {
            val eIntent=Intent(this,beauty::class.java)
            eIntent.putExtra("type","beauty")
            startActivity(eIntent)
        }
        imageView4.setOnClickListener {
            val eIntent=Intent(this,beauty::class.java)
            eIntent.putExtra("type","food")
            startActivity(eIntent)
        }
    }
}
