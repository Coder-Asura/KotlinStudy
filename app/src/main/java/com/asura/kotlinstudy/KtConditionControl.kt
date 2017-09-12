package com.asura.kotlinstudy

import android.util.Log

/**
 * Created by Liuxd on 2017/9/12 11:01.
 * Kotlin 条件控制
 * http://www.runoob.com/kotlin/kotlin-condition-control.html
 */
class KtConditionControl {
    private val TAG = "Asura"
    fun main(args: Array<String>) {
        //IF 表达式
        Log.d(TAG, max1(1, 2).toString())
        Log.d(TAG, max2(555, 777).toString())
        Log.d(TAG, max3(666, 999).toString())
//        val c = if (condition) a else b
        var a = 9
        var b = 2
        val c = if (a > b) a else b
        Log.d(TAG, "c 的值为 $c")

        //使用区间
        if (a in 1..8) {
            Log.d(TAG, "a：$a  在 1..8 区间内")
        } else {
            Log.d(TAG, "a：$a 不在 1..8 区间内")
        }

        //When 表达式
        //和 switch 类似
        var x = 10
        when (x) {
            0, 1 -> Log.d(TAG, "x == 0 or x == 1")
            else -> Log.d(TAG, "otherwise")
        }

        when (x) {
            1 -> Log.d(TAG, "x == 1")
            2 -> Log.d(TAG, "x == 2")
            else -> { // 注意这个块
                Log.d(TAG, "x 不是 1 ，也不是 2")
            }
        }

        when (x) {
            in 0..10 -> Log.d(TAG, "x 在该区间范围内")
            else -> Log.d(TAG, "x 不在该区间范围内")
        }
//        when 中使用 in 运算符来判断集合内是否包含某实例：
        val items = setOf("apple", "banana", "kiwi")
        when {
            "orange" in items -> Log.d(TAG, "juicy")
            "apple" in items -> Log.d(TAG, "apple is fine too")
        }

    }

    fun max1(a: Int, b: Int): Int {
        var max = a
        if (a < b) max = b
        return max
    }

    fun max2(a: Int, b: Int): Int {
        var max: Int
        if (a < b) {
            max = b
        } else {
            max = a
        }
        return max
    }

    fun max3(a: Int, b: Int): Int {
        val max = if (a > b) a else b
        return max
    }
}
