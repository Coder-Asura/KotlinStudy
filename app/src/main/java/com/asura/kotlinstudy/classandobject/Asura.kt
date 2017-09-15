package com.asura.kotlinstudy.classandobject

import com.asura.kotlinstudy.ALog

/**
 * Created by Liuxd on 2017/9/14 13:33.
 */
class Asura constructor(name: String) {
    var url: String = "https://github.com/qq709238339"
    var country: String = "China"
    var nickname = name

    init {
        ALog.d("初始化：$name.url：$url")
    }

    //次构造函数
    constructor(name: String, alexa: Int) : this(name) {
        ALog.d("$name.alexa：$alexa")
    }

    fun sayHello() {
        ALog.d("Hello Kotlin,My nickname is $nickname from $country，welcome to view my Github at $url")
    }
}
