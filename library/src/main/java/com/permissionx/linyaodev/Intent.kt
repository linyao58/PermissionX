package com.permissionx.linyaodev

import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback

fun BaseNewActivity.toPage(
    route: String,
    requestCode: Int = -1,
    navCallback: NavigationCallback? = null,
    body: (Postcard.() -> Unit)? = null
): Any?{
    val build = aRouter.build(route)
    body?.invoke(build)
    if (requestCode != -1){
        return build.navigation(this, requestCode, navCallback)
    }
    return build.navigation(this, navCallback)
}