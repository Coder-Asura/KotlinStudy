package com.asura.kotlinstudy.ktinterface

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/15 15:23.
 */
interface MyInterface {
    //    使用 interface 关键字定义接口，允许方法有默认实现：
    fun bar()

    fun foo() {
        ALog.d("MyInterface接口的默认实现：MyInterface.foo()")
    }

    var name: String
//    var name:String="ssss" //接口不允许属性有初始化值
}