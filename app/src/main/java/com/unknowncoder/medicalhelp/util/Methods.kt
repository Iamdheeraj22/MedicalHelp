package com.unknowncoder.medicalhelp.util

import android.app.Activity
import android.widget.Toast

fun showToast(activity: Activity,msg:String){
    Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show()
}