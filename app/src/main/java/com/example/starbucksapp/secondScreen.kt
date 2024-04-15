package com.example.starbucksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.starbucksapp.databinding.ActivitySecondScreenBinding

class secondScreen : AppCompatActivity() {

    var order = Order()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textViewDrinkOrder = findViewById<TextView>(R.id.textViewDrinkOrder)

        order.productName = intent.getStringExtra("name").toString()

        binding.textViewDrinkOrder.text = order.productName
    }
}