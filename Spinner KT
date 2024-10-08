package com.example.first


import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.first.R

class Spinner : AppCompatActivity() {

    private lateinit var previewTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fontSpinner: Spinner = findViewById(R.id.fontSpinner)
        val fontSizeSpinner: Spinner = findViewById(R.id.fontSizeSpinner)
        previewTextView = findViewById(R.id.previewTextView)

        // Set up font spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.font_names,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            fontSpinner.adapter = adapter
        }

        // Set up font size spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.font_sizes,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            fontSizeSpinner.adapter = adapter
        }

    }
}
