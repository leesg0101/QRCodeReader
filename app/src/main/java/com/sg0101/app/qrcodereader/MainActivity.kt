package com.sg0101.app.qrcodereader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg0101.app.qrcodereader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}