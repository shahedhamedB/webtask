package com.example.cleanappkotlin

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanappkotlin.databinding.ActivityMainBinding
import com.example.cleanappkotlin.ui.webview.WebViewFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}

