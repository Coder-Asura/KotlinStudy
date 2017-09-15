package com.asura.kotlinstudy

import com.asura.kotlinstudy.classandobject.Asura
import com.asura.kotlinstudy.classandobject.Outer
import com.asura.kotlinstudy.classandobject.Person
import com.asura.kotlinstudy.classandobject.Test

/**
 * Created by Liuxd on 2017/9/14 10:32.
 * Kotlin 类和对象
 */
class KtClassAndObject {
    fun main() {
        var person: Person = Person()
        person.name = "Asura2"
        ALog.d("person.name=${person.name}")
        person.age = 8
        ALog.d("person.age=${person.age}")
        person.age = 28
        ALog.d("person.age=${person.age}")
//        person.height=66  //private 修饰，不能调用
        Asura("Asura").sayHello()
        Asura("Asura2", 1000000).sayHello()
        //嵌套类
        val demo = Outer.Nested().foo()// 调用格式：外部类.嵌套类.嵌套类方法/属性
        ALog.d("调用嵌套类中方法：$demo")
        //内部类
        val demo2 = Outer().Inner().foo1()
        ALog.d("调用内部中方法：$demo2")
        Outer().Inner().innerClassTest()
        //匿名内部类
        Test().setInterface(object : Test.TestInterface {
            override fun test() {
                ALog.d("对象表达式创建匿名内部类的实例")
            }
        })

//        类的修饰符
//        类的修饰符包括 classModifier 和_accessModifier_:
//        classModifier: 类属性修饰符，标示类本身特性。
//        abstract    // 抽象类
//        final       // 类不可继承，默认属性
//        enum        // 枚举类
//        open        // 类可继承，类默认是final的
//        annotation  // 注解类
//        accessModifier: 访问权限修饰符
//        private    // 仅在同一个文件中可见
//        protected  // 同一个文件中或子类可见
//        public     // 所有调用的地方都可见
//        internal   // 同一个模块中可见

    }
}