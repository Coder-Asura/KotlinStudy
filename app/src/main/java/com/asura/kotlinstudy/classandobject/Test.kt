package com.asura.kotlinstudy.classandobject

/**
 * Created by Liuxd on 2017/9/14 14:19.
 * Kotlin 匿名内部类
 */
class Test {
    val v = "外部类的成员属性"
    fun setInterface(testInterface: TestInterface) {
        testInterface.test()
    }

    //定义接口
    interface TestInterface {
        fun test()
    }
}