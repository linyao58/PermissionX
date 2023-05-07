package com.permissionx.app

import android.Manifest
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.permissionx.linyaodev.PermissionX
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but.setOnClickListener {
            PermissionX.request(this, android.Manifest.permission.CALL_PHONE){ allGranted, deniedList ->
                if (allGranted){
                    call()
                }else{
                    Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
                }
            }
        }

        but1.setOnClickListener {
            PermissionX.request(this,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_CONTACTS){ allGranted, deniedList ->
                if (allGranted){
                    call()
                }else{
                    Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btu2.setOnClickListener {
            "123456".showToast()
            LogUtil.e("TAG", "Debug log")
        }

        btu3.setOnClickListener {
            123456777.showToast()
        }

        btu4.setOnClickListener {
            startActivity<MainActivity2>(this)
        }

        btu5.setOnClickListener {
            startActivity<MainNewActivity3>(this)
        }

    }

    private fun call(){
        try {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:1008611")
            startActivity(intent)

        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    fun String.showToast(duration:Int = Toast.LENGTH_SHORT){
        Toast.makeText(MyApplication.context, this, duration).show()
    }

    fun Int.showToast(duration:Int = Toast.LENGTH_SHORT){
        Toast.makeText(MyApplication.context, "$this", duration).show()
    }

    inline fun <reified T> startActivity(context: Context){
        val intent = Intent(context, T::class.java)
        context.startActivity(intent)
    }

}