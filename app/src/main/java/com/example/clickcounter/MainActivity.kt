package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.clickcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberCounterText = binding.numberCounter
        var counter = numberCounterText.text.toString().toInt()

        binding.incrementButton.setOnClickListener {
            counter++
            var prevNum = counter - 1
            numberCounterText.text = counter.toString()
            val toast = Toast.makeText(this, "Increment: $prevNum -> $counter", Toast.LENGTH_SHORT)
            toast.show()
        }

        binding.decrementButton.setOnClickListener {
            counter--
            var prevNum = counter + 1
            numberCounterText.text = counter.toString()
            val toast = Toast.makeText(this, "Decrement: $prevNum -> $counter", Toast.LENGTH_SHORT)
            toast.show()
        }

        binding.resetButton.setOnClickListener {
            var prevNum = counter
            counter = 0
            numberCounterText.text = counter.toString()
            val toast = Toast.makeText(this, "Reset: $prevNum -> $counter", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}