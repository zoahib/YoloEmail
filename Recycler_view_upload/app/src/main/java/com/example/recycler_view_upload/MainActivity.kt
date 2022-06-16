package com.example.recycler_view_upload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //function to validate Login Credentials

        //end of function checkLogin
        val my_recycler=findViewById<RecyclerView>(R.id.my_recycler)
        val logbut=findViewById<Button>(R.id.login)
        my_recycler.adapter=Adapter(setData.SetTravelData())
        my_recycler.layoutManager= LinearLayoutManager(this)
        my_recycler.adapter=Adapter(setData.addmoreData(Travellist.size+1,
            "Sample",
            "sample",
            "778.3",
            "24.79",
            "Sample Overview"
            ,R.drawable.fig001
        ))
        val uploadbutton=findViewById<Button>(R.id.upload)

        uploadbutton.setOnClickListener(){
            var uploadopen= Intent(this, uploadactivity::class.java)
            startActivity(uploadopen)
    }
        logbut.setOnClickListener(){
            var uploadopen2= Intent(this, MainActivity2::class.java)
            startActivity(uploadopen2)
        }
}}