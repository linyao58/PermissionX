package com.permissionx.linyaodev

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

    initARouter()

    }

    fun initARouter(){

        ARouter.openLog()
        ARouter.openDebug()

        ARouter.init(this)

    }

}