package com.example.recycler_view_upload



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TravelDetail : AppCompatActivity() {
    private lateinit var obj:TravelData
    private var planetImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_detail)


        obj= intent.getParcelableExtra("planet")!!
        setData(obj)


        val button_info=findViewById<TextView>(R.id.button_info)
        /*button_info.setOnClickListener{
            val intent=Intent(this,finalActivity::class.java)
            startActivity(intent)
        }*/
    }
    private fun setData(obj:TravelData)
    {
        val title_info = findViewById<TextView>(R.id.title_info)
        title_info.text=obj.title
        val distance_info= findViewById<TextView>(R.id.distance_info)
        distance_info.text=obj.distance+"m km"
        val gravity_info = findViewById<TextView>(R.id.gravity_info)
        gravity_info.text=obj.StarRating+" m/ss"
        val overview_info = findViewById<TextView>(R.id.overview_info)
        overview_info.text=obj.overview
        val galaxy_info = findViewById<TextView>(R.id.galaxy_info)
        galaxy_info.text=obj.Location
        val planet_img_info = findViewById<ImageView>(R.id.planet_img_info)
        planet_img_info.setImageResource(obj.image)


    }
}