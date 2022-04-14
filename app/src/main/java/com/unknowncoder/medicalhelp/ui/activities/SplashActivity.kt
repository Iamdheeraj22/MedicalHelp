package com.unknowncoder.medicalhelp.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var biniding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biniding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(biniding.root)
        val handler=Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(this,PreHomeActivity::class.java))
            finish()
        },2000)
    }
}