package com.example.superherolist


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superherolist.databinding.FragmentHomeBinding



class FragmentHome : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Init the recyclerView
        setUpRecyclerView()

        // proofs field
        binding.btNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentHome_to_fragmentSuperHero)
        }

        // Return view
        return binding.root
    }

    private fun getSuperheros(): MutableList<SuperHero>{
        var superheros:MutableList<SuperHero> = ArrayList()
        superheros.add(SuperHero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        superheros.add(SuperHero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        superheros.add(SuperHero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        superheros.add(SuperHero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        superheros.add(SuperHero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        superheros.add(SuperHero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        superheros.add(SuperHero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        superheros.add(SuperHero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        return superheros
    }

    private fun setUpRecyclerView(){
        binding.rvSuperheroList.layoutManager = LinearLayoutManager(context) // context -> Fragment // this -> Activity
        val adapter = HeroAdapter(getSuperheros(), findNavController())
        binding.rvSuperheroList.adapter = adapter
    }

//    private fun toast(text: String) {
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
//    }

}