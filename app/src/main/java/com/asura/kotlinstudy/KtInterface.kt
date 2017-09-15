package com.asura.kotlinstudy

import com.asura.kotlinstudy.ktinterface.Child
import com.asura.kotlinstudy.ktinterface.Child2

/**
 * Created by Liuxd on 2017/9/15 15:21.
 * Kotlin 接口
 * http://www.runoob.com/kotlin/kotlin-interface.html
 */
class KtInterface {
    fun main() {
        val c = Child()
        c.bar()
        c.foo()
        ALog.d("c.name ：${c.name}")
        ALog.d("-----------------------------------------------------")
        val d = Child2()
        d.bar()
        d.foo()
        ALog.d("d.name ：${d.name}")
    }
}