package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)

        rollButton.setOnClickListener{rollDice()}

        countButton.setOnClickListener{countUp()}


    }
    private fun rollDice(){
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText : TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()
    }
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val strText = resultText.text.toString()

        if (strText != "Hello World!") {
            var intText = strText.toInt()
            intText += 1
            if (intText <= 6) {
                resultText.text = intText.toString()
            }
        }
    }
}