package com.example.countrycustomlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val countryList = ArrayList<Country>()
        countryList.add(Country(R.drawable.bangladesh_img,"Bangladesh",R.string.bangladesh_short_details,R.string.bangladesh_long_details))
        countryList.add(Country(R.drawable.india_img,"India",R.string.india_short_details,R.string.india_long_details))
        countryList.add(Country(R.drawable.pakistan_img,"Pakistan",R.string.pakistan_short_details,R.string.pakistan_long_details))
        countryList.add(Country(R.drawable.nepal_img,"Nepal",R.string.nepal_short_details,R.string.nepal_long_details))
        countryList.add(Country(R.drawable.bhutan_img,"Bhutan",R.string.bhutan_short_details,R.string.bhutan_long_details))
        countryList.add(Country(R.drawable.srilanka_img,"Srilanka",R.string.srilanka_short_details,R.string.srilanka_long_details))
        countryList.add(Country(R.drawable.mayanmar_img,"Mayanmar",R.string.mayanmar_short_details,R.string.mayanmar_long_details))
        countryList.add(Country(R.drawable.south_korea_img,"South Korea",R.string.south_korea_short_details,R.string.south_korea_long_details))
        countryList.add(Country(R.drawable.china_img,"China",R.string.china_short_details,R.string.china_long_details))
        countryList.add(Country(R.drawable.australia_img,"Australia",R.string.australia_short_details,R.string.australia_long_details))

        val countryAdapter = CountryAdapter(this,countryList)

        listView.adapter = countryAdapter


        listView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this@MainActivity,DetailsActivity::class.java)

            intent.putExtra("countryName",countryList[i].name)
            intent.putExtra("countryImage",countryList[i].image)
            intent.putExtra("countryLongDetails",countryList[i].longDetails)

            startActivity(intent)

        }

    }
}