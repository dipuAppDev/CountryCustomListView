package com.example.countrycustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    private lateinit var countryName: TextView
    private lateinit var countryImage:ImageView
    private lateinit var countryLongDetails:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        countryName = findViewById(R.id.countryNameD)
        countryImage = findViewById(R.id.countryImageD)
        countryLongDetails = findViewById(R.id.countryLongDetails)


       countryName.text =  intent.getStringExtra("countryName").toString()
       countryImage.setImageResource(intent.getIntExtra("countryImage",0))
       countryLongDetails.setText(intent.getIntExtra("countryLongDetails",0))


    }
}