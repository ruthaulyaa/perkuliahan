package com.example.pampraktikum5_11s20018

import android.content.Context import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter (
    var countryNameList: ArrayList<String>,
    var countryDetailsList: ArrayList<String>,
    var countryLogoList: ArrayList<Int>,
    var context: Context
    ) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCountryName: TextView = itemView.findViewById(R.id.tvCountryName)
        var tvCountryDetails: TextView = itemView.findViewById(R.id.tvCountryDetail)
        var ivCountryLogo: CircleImageView = itemView.findViewById(R.id.ivCountryLogo)
        var cvItem: CardView = itemView.findViewById(R.id.cvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.tvCountryName.text = countryNameList.get(position)
        holder.tvCountryDetails.text = countryDetailsList.get(position)
        holder.ivCountryLogo.setImageResource(countryLogoList.get(position))

        holder.cvItem.setOnClickListener {
            Toast.makeText(
                context,
                "Kamu memilih negara ${countryNameList.get(position)}.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }
}