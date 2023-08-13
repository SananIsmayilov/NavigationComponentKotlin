package com.sananismayilov.bottomnavapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.sananismayilov.bottomnavapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navhostfragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomnavmenu,navHostFragment.navController)


    }
}