package com.asura.kotlinstudy.classandobject

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/14 14:02.
 * Kotlin 嵌套类
 */
class Outer {
    private val bar: Int = 1
    var v = "外部类的成员属性"

    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo1() = bar//访问外部类成员
        fun innerClassTest() {
            var o = this@Outer//获取外部类的成员变量
            ALog.d("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}