package com.example.recycler_view_upload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class uploadactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uploadactivity)
        val address = intent.getIntExtra("address", -1)
        val edittext1=findViewById<TextView>(R.id.upload)
        val edittext2=findViewById<EditText>(R.id.editPlace)
        val edittext3=findViewById<EditText>(R.id.editshortDescription)
        val edittext4=findViewById<EditText>(R.id.editLongdescription)
        val Placeval:String=edittext2.text.toString().trim()
        val Placeval2:String=edittext3.text.toString().trim()
        val Placeval3:String=edittext4.text.toString().trim()
        val images2=findViewById<ImageButton>(R.id.imageView2)
        val images3=findViewById<ImageButton>(R.id.imageView3)
        val images4=findViewById<ImageButton>(R.id.imageView4)
        val images5=findViewById<ImageButton>(R.id.imageView5)
        val images6=findViewById<ImageButton>(R.id.imageView6)
        val images7=findViewById<ImageButton>(R.id.imageView7)
       // val address=edittext1.text
        var imageid=R.id.imageView2


        val submit=findViewById<Button>(R.id.submit)

        images2.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView2
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView2)
            startActivity(mainopen)
        }
        images3.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView3
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView3)
            startActivity(mainopen)
        }
        images4.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView4
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView4)
            startActivity(mainopen)
        }
        images5.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView5
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView5)
            startActivity(mainopen)
        }
        images6.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView6
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView6)
            startActivity(mainopen)
        }
        images7.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)
            imageid=R.id.imageView7
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),R.id.imageView7)
            startActivity(mainopen)
        }


        submit.setOnClickListener(){
            val mainopen= Intent(this, MainActivity::class.java)

           // val my_recycler=findViewById<RecyclerView>(R.id.my_recycler)
            //my_recycler.layoutManager= LinearLayoutManager(this)
            //my_recycler.adapter=Adapter(setData.addmoreData(Travellist.size+1,
              //  Placeval,Placeval2,"Mehmood","20",Placeval3, R.drawable.fig002))
            setData.addmoreData(Travellist.size+1, edittext2.text.toString(),edittext3.text.toString(),"Mehmood","20",edittext4.text.toString(),imageid)
            startActivity(mainopen)
        }
    }
}