package com.example.landmarkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkapp.databinding.DetailsBinding

class DetailsActivity : AppCompatActivity() {
    private  lateinit var binding: DetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val intent = intent
//casting
        val selectedlandmark=intent.getSerializableExtra("landmark") as Landmark

        binding.name.text=selectedlandmark.name
        binding.country.text=selectedlandmark.country
        binding.imageView.setImageResource(selectedlandmark.image)
     }
}