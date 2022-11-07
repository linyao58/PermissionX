package com.permissionx.app

import android.app.Application
import android.content.Context
import android.widget.Toast

class MyApplication : Application() {

    companion object{
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }



}