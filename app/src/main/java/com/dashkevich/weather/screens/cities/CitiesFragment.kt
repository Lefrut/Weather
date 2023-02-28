package com.dashkevich.weather.screens.cities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.dashkevich.weather.R
import com.dashkevich.weather.databinding.FragmentCitiesBinding

class CitiesFragment : Fragment(R.layout.fragment_cities) {

    lateinit var binding: FragmentCitiesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCitiesBinding.bind(view)
    }

}