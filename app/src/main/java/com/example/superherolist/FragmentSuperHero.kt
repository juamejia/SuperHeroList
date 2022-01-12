package com.example.superherolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.superherolist.databinding.FragmentHomeBinding
import com.example.superherolist.databinding.FragmentSuperHeroBinding


class FragmentSuperHero : Fragment() {

    lateinit var binding: FragmentSuperHeroBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSuperHeroBinding.inflate(inflater, container, false)
        binding.tvHeroTitle.text = getBundle()

        return binding.root
    }

    fun getBundle(): String? {
        // participants number
        return arguments?.get("heroName").toString()
    }


}