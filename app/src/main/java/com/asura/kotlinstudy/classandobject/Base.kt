package com.asura.kotlinstudy.classandobject

/**
 * Created by Liuxd on 2017/9/14 14:00.
 * Kotlin 抽象类
 * 抽象是面向对象编程的特征之一，类本身，或类中的部分成员，都可以声明为abstract的。抽象成员在类中不存在具体的实现。
注意：无需对抽象类或抽象成员标注open注解。
 */
open class Base {
    open fun f() {}
    abstract class Darived : Base() {
        override fun f() {

        }
    }
}