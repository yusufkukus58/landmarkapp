package com.example.landmarkapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkapp.databinding.ReyclerRowBinding

//recylerview dan extends et adapter sınıfından
//landmarkholder adlı sınıf olustu içinde gorunum tutucu
class LandmarkAdapter(val landmarkList:ArrayList<Landmark> ) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>(){

    class LandmarkHolder(val binding: ReyclerRowBinding) :RecyclerView.ViewHolder(binding.root){}

    //layout buraya baglanır yanı recyler_row u
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
       val bindig= ReyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  LandmarkHolder(bindig)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
      holder.binding.recylerviewText.text=landmarkList.get(position).name
        holder.itemView.setOnClickListener{
            val intent =Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}