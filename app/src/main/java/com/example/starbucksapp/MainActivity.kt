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

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var order = Order()

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

        binding.imageViewDrink1.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageViewDrink1 -> Toast.makeText(this@MainActivity, "Drink 1", Toast.LENGTH_SHORT).show()
        }
        openIntent(applicationContext, order.productName,secondScreen::class.java)
    }

    private fun openIntent(context: Context, order: String, activityToOpen: Class<*>) {
        val intent = Intent(context, activityToOpen)

        intent.putExtra("order", order)

        context.startActivity(intent)
    }


    /*fun shareIntent(context: Context, order: String) {
        var sendIntent = Intent()
        sendIntent.setAction(Intent.ACTION_SEND)
        sendIntent.putExtra(Intent.EXTRA_TEXT, order)

        sendIntent.setType("text/plain")

        var shareIntent = Intent.createChooser(sendIntent, null)
        context.startActivity(shareIntent)
    }

    fun shareIntent(context: Context, order: Order) {
        var sendIntent = Intent()
        sendIntent.setAction(Intent.ACTION_SEND)

        var shareOrderDetails = Bundle()
        shareOrderDetails.putString("productName", order.productName)

        sendIntent.putExtra(Intent.EXTRA_TEXT, shareOrderDetails)
        sendIntent.setType("text/plain")

        var shareIntent = Intent.createChooser(sendIntent, null)
        context.startActivity(shareIntent)

    }*/

}