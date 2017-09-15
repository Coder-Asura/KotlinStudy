package com.asura.kotlinstudy.ktinterface

/**
 * Created by Liuxd on 2017/9/15 15:31.
 */
class Child2 : MyInterface, MyInterface2 {
    override fun bar() {
        super<MyInterface2>.bar()
    }

    override fun foo() {
        super<MyInterface>.foo()
        super<MyInterface2>.foo()
    }

    override var name: String
        get() = "Child2"
        set(value) {}
}