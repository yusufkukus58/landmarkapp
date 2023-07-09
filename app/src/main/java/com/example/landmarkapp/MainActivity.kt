package com.example.landmarkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterViewFlipper
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var LandmarkList:ArrayList<Landmark>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LandmarkList= ArrayList<Landmark>()
        //data
        val colessium =Landmark("colessium","italy",R.drawable.colessium)
        val eiffel =Landmark("eiffel","france",R.drawable.eiffel)
        val londonbridge =Landmark("london bridge","uk",R.drawable.london_bridge)

        LandmarkList.add(colessium)
        LandmarkList.add(eiffel)
        LandmarkList.add(londonbridge)
binding.ryview.layoutManager=LinearLayoutManager(this)
         val landmarkAdapter= LandmarkAdapter(LandmarkList)
        binding.ryview.adapter=landmarkAdapter
/*
        //adapter layout & data

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,LandmarkList.map {
            landmark -> landmark.name
        })
        binding.listview.adapter=adapter // listview ile adapteri bagla burda
        //burda veri akytarımı var position onemli burda tıklanınca hangi veriye erişcegini orda soluyoz index gib

        binding.listview.onItemClickListener= AdapterView.OnItemClickListener{
            parent,view,position,id->
           val intent=Intent(MainActivity@this,DetailsActivity::class.java)//sayfaya gectim
            intent.putExtra("landmark",LandmarkList.get(position))
            startActivity(intent)

 */

        }
    }
