package com.app.eco_co.common.view.start

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.eco_co.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    } // End of onCreate()

} // End of StartActivity class
