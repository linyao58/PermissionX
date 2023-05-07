package com.permissionx.linyaodev

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

open class LoginNewActivity : BaseNewActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var login = findViewById<TextView>(R.id.login)
        var number = findViewById<TextView>(R.id.number)
        var e_number = findViewById<EditText>(R.id.e_number)
        var password = findViewById<TextView>(R.id.password)
        var p_number = findViewById<EditText>(R.id.p_number)
        var btu = findViewById<Button>(R.id.btu)

    }
}