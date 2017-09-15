package com.asura.kotlinstudy.ktinterface

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/15 15:24.
 */
class Child : MyInterface {
    override var name: String
        get() = "Child"
        set(value) {}

    override fun bar() {
        ALog.d("类对接口的具体实现：Child.bar()")
    }
}