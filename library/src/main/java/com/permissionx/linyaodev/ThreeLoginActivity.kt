package com.permissionx.linyaodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

open class ThreeLoginActivity : LoginActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        login.text = "哈哈哈"

        btu.text = "登录模块"

        btu.setOnClickListener {
            Toast.makeText(this, "登录中", Toast.LENGTH_SHORT).show()
        }

    }
}