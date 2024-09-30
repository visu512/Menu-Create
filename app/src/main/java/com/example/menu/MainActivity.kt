package com.example.menu

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val showMenu = CustomMenu(); // create object if class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var optionBtn = findViewById<Button>(R.id.optionBtn)

        optionBtn.setOnClickListener {

            showMenu.showMenu(this,it)
        }

    }
}