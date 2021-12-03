package com.kanini.buttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val showcolorDisplayView=findViewById<TextView>(R.id.notyetclicked)


        val clickmeButton1=findViewById<TextView>(R.id.clickButton1)
        val clickmeButton2=findViewById<TextView>(R.id.clickButton2)
        val clickmeButton3=findViewById<TextView>(R.id.clickButton3)
        clickmeButton1.setOnClickListener {

            showcolorDisplayView.text="blue was clicked"
        }
            clickmeButton2.setOnClickListener {

                showcolorDisplayView.text="red was clicked"
            }
                clickmeButton3.setOnClickListener {

                    showcolorDisplayView.text="green was clicked"
                }
        }
    }
