package com.permissionx.linyaodev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

open class BaseNewActivity: AppCompatActivity() {

    val aRouter = ARouter.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ARouter.getInstance().inject(this)

    }

}