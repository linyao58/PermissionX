# PermissionX

PermissionX是一个用于简化Android运行时权限用法的开源库

使用如下语法结构来申请运行时权限：
、、、kotlin
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
...