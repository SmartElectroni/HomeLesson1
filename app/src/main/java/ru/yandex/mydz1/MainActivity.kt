package ru.yandex.mydz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1: Button = findViewById<Button>(R.id.button_1)
        val button_2: Button = findViewById<Button>(R.id.button_2)
        val button_3: Button = findViewById<Button>(R.id.button_3)

        button_1.setOnClickListener {

            Log.e("DZZ", "Нажата кнопка 1")

        }

        button_2.setOnClickListener {

            Log.e("DZZ", "Нажата кнопка 2")

        }

        button_3.setOnClickListener {

            Log.e("DZZ", "Нажата кнопка 3")

        }

    }
}