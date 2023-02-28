package com.dashkevich.weather.screens.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.dashkevich.weather.R
import com.dashkevich.weather.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }
}