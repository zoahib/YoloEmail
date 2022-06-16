package com.example.recycler_view_upload

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter( var planet: List<TravelData>) :
    RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById<TextView>(R.id.title)
        var planetimg: ImageView = view.findViewById<ImageView>(R.id.planet_img)
        var galaxy: TextView = view.findViewById<TextView>(R.id.galaxy)
        var distance: TextView = view.findViewById<TextView>(R.id.distance)
        var gravity: TextView = view.findViewById<TextView>(R.id.gravity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,TravelDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }

        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].Location
        holder.distance.text = planet[position].distance + "km"
        holder.gravity.text = planet[position].title
        holder.planetimg.setImageResource(planet[position].image)


    }

    override fun getItemCount(): Int {
        return planet.size
    }
}
