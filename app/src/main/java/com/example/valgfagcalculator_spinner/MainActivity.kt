package com.example.valgfagcalculator_spinner

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.valgfagcalculator_spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        val a = binding.firstNo.text.toString().toInt()
        val b = binding.secNo.text.toString().toInt()
        var result = 0
        when (binding.operatorSpinner.selectedItem.toString()) {
            "+" -> result = (a + b)
            "-" -> result = (a - b)
            "/" -> result = (a / b)
            "*" -> result = (a * b)
        }
        val res = result.toString()
        binding.resultTextView.text = res

    }
}


