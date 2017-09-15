package com.asura.kotlinstudy.classandobject

/**
 * Created by Liuxd on 2017/9/14 10:37.
 * Kotlin 类的定义
 */
class Person {
    var name: String = "Asura"
        get() = field.toUpperCase()
        set
    var age: Int = 18
        get() = field
        set(value) {
            if (value < 18) {
                field = -1
            } else {
                field = value
            }
        }
    var height: Float = 160.5f
        private set

}