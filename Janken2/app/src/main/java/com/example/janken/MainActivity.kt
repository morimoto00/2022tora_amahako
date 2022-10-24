package com.example.janken

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.edit
import androidx.preference.PreferenceManager
//import com.example.helloandroid.databinding.ActivityMainBinding
import com.example.janken.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        setContentView(binding.root)

        binding.gu.setOnClickListener{ onJnakenButtonTapped(it)}
        binding.choki.setOnClickListener{ onJnakenButtonTapped(it)}
        binding.pa.setOnClickListener{onJnakenButtonTapped(it)}

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit {
            clear()
        }
    }
    fun onJnakenButtonTapped(view: View?){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }

}