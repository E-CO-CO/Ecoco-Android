package com.app.eco_co.common.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.eco_co.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    } // End of onCreate()
} // End of MainActivity class
