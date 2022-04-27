package com.unknowncoder.medicalhelp.util

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import com.unknowncoder.medicalhelp.R

class CustomProgressBar(val context: Context) {
    lateinit var dialog: AlertDialog
    fun showCustomProgressBar(){
        dialog= AlertDialog.Builder(context).create()
        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_progress_bar,null,false)
        dialog.setView(view)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }
    fun hideCustomProgressBar(){
        dialog.dismiss()
    }
}