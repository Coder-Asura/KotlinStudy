package com.asura.kotlinstudy

import com.asura.kotlinstudy.classextends.Person

/**
 * Created by Liuxd on 2017/9/15 14:03.
 * Kotlin 继承
 * http://www.runoob.com/kotlin/kotlin-extend.html
 */
class KtExtends
//    : Any() //从 Any 隐式继承，注意：Any 不是 java.lang.Object。
{
    fun main() {
        val s = Person.Student("Asura", 18, "S007", 100);
        ALog.d(s.toString())
        s.study()
        s.a()
        s.f()
        s.b()
    }

}
