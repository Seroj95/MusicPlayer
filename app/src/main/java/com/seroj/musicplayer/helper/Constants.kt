package com.seroj.musicplayer.helper

import android.content.Context
import android.widget.Toast
import java.util.concurrent.TimeUnit

object Constants {
    const val REQUEST_CODE_FOR_PERMISIONS=123
    fun Context.toast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
    fun durationConverter(douration:Long):String{
        return String.format("%02d:%02d",
        TimeUnit.MICROSECONDS.toMillis(douration),
        TimeUnit.MICROSECONDS.toSeconds(douration)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(douration)))


    }
}