package com.example.numberpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myNumberPicker = findViewById<NumberPicker>(R.id.myNumberPicker)
        val colors = arrayOf("Red", "Dark Blue", "Green", "Yellow", "White", "Purple", "Grey", "Maroon", "Orange",
            "Pink", "Silver", "Brown", "Light Blue")
        myNumberPicker.minValue = 0
        myNumberPicker.maxValue = colors.size - 1
        myNumberPicker.wrapSelectorWheel = false
        myNumberPicker.displayedValues = colors
        myNumberPicker.setOnValueChangedListener { picker,
                                                   oldVal,
                                                   newVal ->
            Toast.makeText(this,
                "Val is: ${colors[newVal]}", Toast.LENGTH_LONG).show()
        }
    }
}