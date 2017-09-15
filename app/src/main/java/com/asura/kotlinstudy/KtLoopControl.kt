package com.asura.kotlinstudy

/**
 * Created by Liuxd on 2017/9/12 11:30.
 * Kotlin 循环控制
 * http://www.runoob.com/kotlin/kotlin-loop-control.html
 */
class KtLoopControl {
    fun main(args: Array<String>) {
        list()
        doWhile()
        returnSkip()
    }

    private fun returnSkip() {
//        Kotlin 有三种结构化跳转表达式：
//          return。默认从最直接包围它的函数或者匿名函数返回。
//          break。终止最直接包围它的循环。
//          continue。继续下一次最直接包围它的循环。
        ALog.d("continue，break用法")
        for (i in 1..10) {
            if (i == 3) continue
            if (i > 5) break
            ALog.d(i.toString())//1 2 4 5
        }
        ALog.d("@标签用法")
        val items = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
        items.forEach limit@ {
            if (it == 5) return@limit//和 continue 效果一样
            ALog.d(it.toString())//1 2 3 4 6 7 8 9
        }
        ALog.d("会不会打印我啊啊啊啊，111")
        items.forEach {
            if (it == 5) return@forEach//通常情况下使用隐式标签更方便。 该标签与接受该 lambda 的函数同名。
            ALog.d(it.toString())//1 2 3 4 6 7 8 9
        }
        ALog.d("会不会打印我啊啊啊啊，222")
//        用一个匿名函数替代 lambda 表达式。 匿名函数内部的 return 语句将从该匿名函数自身返回
        items.forEach(fun(value: Int) {
            if (value == 5) return
            ALog.d(value.toString())//1 2 3 4 6 7 8 9
        })

        ALog.d("会不会打印我啊啊啊啊，333")
    }

    private fun doWhile() {
        var a = 6;
        ALog.d("while使用")
        while (a > 0) {
            ALog.d(a.toString())//6 5 4 3 2 1
            a--
        }
        ALog.d("do...while使用")
        var b = 6
        do {
            ALog.d(b.toString())//6
            b--
        } while (b > 7)
    }

    private fun list() {
        val items = listOf<String>("1111111", "222222222", "33333333")
        for (item in items) {
            ALog.d(item)
        }
        for (index in items.indices) {
            ALog.d("item at $index is ${items[index]}")
        }
    }
}