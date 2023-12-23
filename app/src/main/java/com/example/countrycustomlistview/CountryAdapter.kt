package com.example.countrycustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class CountryAdapter (context: Context,countryList: ArrayList<Country>)
    : ArrayAdapter<Country>(context,R.layout.country_item,countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var countryItem  = convertView
        if (countryItem == null){
            countryItem = LayoutInflater.from(context).inflate(R.layout.country_item,parent,false)
        }
        val countryImage = countryItem!!.findViewById<ShapeableImageView>(R.id.countryImage)
        val countryName = countryItem.findViewById<TextView>(R.id.countryName)
        val countryShortDetails = countryItem.findViewById<TextView>(R.id.countryShortDetails)

        countryImage.setImageResource(getItem(position)!!.image)
        countryName.setText(getItem(position)!!.name)
        countryShortDetails.setText(getItem(position)!!.shortDetails)


        return countryItem

    }
}