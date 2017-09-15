package com.asura.kotlinstudy.ktinterface

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/15 15:23.
 */
interface MyInterface2 {
    //    使用 interface 关键字定义接口，允许方法有默认实现：
    fun bar(){
        ALog.d("MyInterface2接口的默认实现：MyInterface2.bar()")
    }

    fun foo(){
        ALog.d("MyInterface2接口的默认实现：MyInterface2.foo()")
    }

}