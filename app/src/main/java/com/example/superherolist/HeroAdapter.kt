package com.example.superherolist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController

import androidx.recyclerview.widget.RecyclerView

class HeroAdapter(val superHero: List<SuperHero>, private val binding: NavController): RecyclerView.Adapter<HeroHolder>(){
    lateinit var temp: Any

    // Autogenerate implementation by adapter properties

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        // create the View Holder
        val layoutInflater = LayoutInflater.from(parent.context)
        return  HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false)) // Proof filed mListener
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHero[position])
        holder.itemView.setOnClickListener {
            println("probe ${superHero[position]}")
            val bundle= Bundle()
            bundle.putString("heroName", superHero[position].superHeroName)
            binding.navigate(R.id.action_fragmentHome_to_fragmentSuperHero, bundle)
        }
    }

    override fun getItemCount(): Int {
        return superHero.size
    }

}