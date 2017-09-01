package com.asura.kotlinstudy

import android.util.Log

/**
 * Created by Liuxd on 2017/9/1 15:07.
 * Kotlin 基础语法
 * http://www.runoob.com/kotlin/kotlin-basic-syntax.html
 */
class KtBasicGrammar {
    private val TAG = "Asura";
    fun main(args: Array<String>) {
        Log.d(TAG, sum(1, 1).toString())
        Log.d(TAG, sum1(1, 1).toString())
        Log.d(TAG, sum2(2, 2).toString())
        Log.d(TAG, sum4(4, 4).toString())//todo 输出了 kotlin.Unit ，暂时不解
    }

    //    函数定义使用关键字 fun，参数格式为：参数 : 类型
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //    表达式作为函数体，返回类型自动推断：
    fun sum1(a: Int, b: Int) = a + b

    public fun sum2(a: Int, b: Int): Int = a + b // public 方法则必须明确写出返回类型
    //    无返回值的函数(类似Java中的void)：
    fun sum4(a: Int, b: Int): Unit {
        a + b
    }
}
