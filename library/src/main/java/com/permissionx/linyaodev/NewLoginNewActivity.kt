package com.permissionx.linyaodev

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

open class NewLoginNewActivity : LoginNewActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        login.text = "新的登录界面"
        btu.setOnClickListener {
            toPage(main)
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
        }

        btu.text = "新的页面登录"

    }
}