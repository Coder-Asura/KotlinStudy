package com.asura.kotlinstudy.classextends

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/15 14:56.
 */
open class Person(var name: String, var age: Int) {
    fun fight() {//此函数默认为final修饰，不能被子类重写

    }

    open fun study() {//open关键字修饰，可以被子类重写
        ALog.d("我要学习")
    }

    open fun a() {
        ALog.d("Person.a()")
    }

    open fun f() {
        ALog.d("Person.f()")
    }

    //如果一个类要被继承，可以使用 open 关键字进行修饰。
    class Student(name: String, age: Int, var no: String, var score: Int) : Person(name, age), B {
        override fun a() {
            super<Person>.a()
        }

        override fun f() {
            super<Person>.f()
            super<B>.f()
        }

        override fun toString(): String {
            return "Student(name='$name', age=$age, no='$no', score=$score)"
        }

        override fun study() {
            super.study()
            ALog.d("我学习完了，毕业了")
        }
    }

    interface B {
        fun f() {
            ALog.d("B.f()")
        }

        fun b() {
            ALog.d("B.b()")
        }

        fun a()
    }

}