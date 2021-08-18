package com.viewbinding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.viewbinding.R
import com.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "Text kotlin view binding"
        binding.imageView.setBackgroundResource(R.drawable.ic_launcher_background)

    }
}