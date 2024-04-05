package com.kayise.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declare variables
    

    private lateinit var enterAge:EditText
    private lateinit var button:Button
    private lateinit var button2:Button
    private lateinit var textView2:TextView




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize variables
        enterAge = findViewById(R.id.enterAge)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        textView2 = findViewById(R.id.textView)


        button.setOnClickListener{

            val userAgeInput = enterAge.text.toString().toIntOrNull()
            if (userAgeInput != null && userAgeInput in 20..100) {

                val famousName = when (userAgeInput) {
                    25 -> "Tupac Shakur"
                    32 -> "Bruce Lee"
                    40 -> "Paul Walker"
                    52 -> "William Shakespeare"
                    63 -> "Robin Williams"
                    74 -> "Muhammad Ali"
                    86 -> "Maya Angelou"
                    90 -> "Nelson Mandela"
                    95 -> "Helen Keller"
                    100 -> "Kirk Douglas"
                    else -> null

                }


                val message = if (famousName != null) "The famous person is $famousName."
                else "No famous historical person found with the entered age."
                textView2.text = message

            } else {
                textView2.text = "Invalid input. Please enter a valid age between 20 and 100"

            }
        }
        
        button2.setOnClickListener{
            enterAge.text.clear()
            textView2.text = ""
        }
    }
}