package com.example.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.databinding.ActibityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setCountentView(view)

        binding.tapHere.setOn
}