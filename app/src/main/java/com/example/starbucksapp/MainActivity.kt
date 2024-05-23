package com.example.starbucksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.starbucksapp.databinding.ActivityMainBinding
var Product: OrderData = OrderData("")
class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var imageViewDrink1: ImageView
    lateinit var imageViewDrink2: ImageView
    lateinit var imageViewDrink3: ImageView
    lateinit var imageViewDrink4: ImageView
    lateinit var imageViewDrink5: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageViewDrink1 = findViewById(R.id.imageViewDrink1)
        imageViewDrink2 = findViewById(R.id.imageViewDrink2)
        imageViewDrink3 = findViewById(R.id.imageViewDrink3)
        imageViewDrink4 = findViewById(R.id.imageViewDrink4)
        imageViewDrink5 = findViewById(R.id.imageViewDrink5)

        Product.ProductName ="Drink 1"

        binding.imageViewDrink1.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when (v?.id)
        {
            R.id.imageViewDrink1 -> Toast.makeText(this@MainActivity, "Drink 1", Toast.LENGTH_SHORT).show()
            R.id.imageViewDrink2 -> Toast.makeText(this@MainActivity, "Drink 2", Toast.LENGTH_SHORT).show()

        }

        val intent = Intent(this, secondScreen::class.java)
        startActivity(intent)

    }
}