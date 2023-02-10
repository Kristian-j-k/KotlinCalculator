package com.example.valgfagcalculator_spinner

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.valgfagcalculator_spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.button.setOnClickListener {
    binding.resultTextView.text = (
            binding.firstNo.text.toString().toInt()
                    + binding.secNo.text.toString().toInt()).toString()
}







    }
}