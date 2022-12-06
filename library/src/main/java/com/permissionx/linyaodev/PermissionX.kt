package com.permissionx.linyaodev

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

object PermissionX {

    private const val TAG = "InvisibleFragment"

//    activity动态获取权限
    fun request(activity: FragmentActivity, vararg permissions: String, callback: PermissionCallback){

        val fragmentManager = activity.supportFragmentManager
        val existedFragment = fragmentManager.findFragmentByTag(TAG)
        val fragment = if (existedFragment != null){
            existedFragment as InvisibleFragment
        }else{
            val invisibleFragment = InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback, *permissions)
    }

//    fragment动态获取权限
    fun fragmentRequest(fragment: Fragment, vararg permissions: String, callback: PermissionCallback){

//    viewPage与fragment搭配下，fragmentManager是获取fragment.childFragmentManager
        val fragmentManager = fragment.childFragmentManager
        val existedFragment = fragmentManager.findFragmentByTag(TAG)
        val fragment = if (existedFragment != null){
            existedFragment as InvisibleFragment
        }else{
            val invisibleFragment = InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback, *permissions)
    }

}