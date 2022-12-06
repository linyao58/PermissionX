package com.permissionx.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.permissionx.app.fragment.MainFragment

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, MainFragment.newInstance()).commit()

    }
}