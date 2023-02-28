package com.dashkevich.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dashkevich.weather.databinding.ActivityMainBinding

//° ℃

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.textView.text = "°"
    }
}