package com.example.starbucksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.starbucksapp.databinding.ActivitySecondScreenBinding

class secondScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textViewDrinkOrder = findViewById<TextView>(R.id.textViewDrinkOrder)
        val imageView2DrinkOrder = findViewById<ImageView>(R.id.imageView2DrinkOrder)

        binding.textViewDrinkOrder.text = Product.ProductName

        when(Product.ProductName) {
                "Drink 1" -> binding.imageView2DrinkOrder.setImageResource(R.drawable.drink1)
        }
    }
}