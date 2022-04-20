package com.unknowncoder.medicalhelp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            if(it.itemId==R.id.homeItem){
                findNavController(R.id.nav_fragment_view).navigate(R.id.homeFragment)
                return@setOnItemSelectedListener true
            }else if (it.itemId==R.id.profileItem){
                findNavController(R.id.nav_fragment_view).navigate(R.id.userProfileFragment)
                return@setOnItemSelectedListener true
            }
            return@setOnItemSelectedListener false
        }
    }
}