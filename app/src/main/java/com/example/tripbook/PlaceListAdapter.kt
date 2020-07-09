package com.example.tripbook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tripbook.Place
import com.example.tripbook.R

 class PlaceListAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<PlaceListAdapter.PlaceViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var places = emptyList<Place>() // Cached copy of places

    inner class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val placeItemView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val itemView = inflater.inflate(R.layout.fragment_search_by_city, parent, false)
        return PlaceViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val current = places[position]
        holder.placeItemView.text = current.country
        holder.placeItemView.text = current.city


    }

    internal fun setPlaces(places: List<Place>) {
        this.places = places
        notifyDataSetChanged()
    }

    override fun getItemCount() = places.size
}
