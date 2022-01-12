package com.example.superherolist

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.superherolist.databinding.ItemSuperheroBinding

import com.squareup.picasso.Picasso

class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun render(superHero: SuperHero){
        binding.tvRealName.text = superHero.realName
        binding.tvSuperheroName.text = superHero.superHeroName
        binding.tvPublisher.text = superHero.publisher
        // Convert Url in image and set it into viewBinding
        Picasso.get().load(superHero.image).into(binding.ivHero)
    }

}