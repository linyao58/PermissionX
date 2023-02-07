package com.permissionx.linyaodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

open class NewLoginActivity : LoginActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        login.text = "新的登录界面"
        btu.setOnClickListener {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
        }

        btu.text = "新的页面登录"

    }
}