# PermissionX

PermissionX是一个用于简化Android运行时权限用法的开源库

使用如下语法结构来申请运行时权限：
、、、kotlin
//activity动态获取权限
PermissionX.request(this,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_CONTACTS){ allGranted, deniedList ->
                if (allGranted){
                    call()//调用其他方法
                }else{
                    Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
                }
            }

//            fragment动态获取权限
      fun fragmentRequest(fragment: Fragment, vararg permissions: String, callback: PermissionCallback){

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

...