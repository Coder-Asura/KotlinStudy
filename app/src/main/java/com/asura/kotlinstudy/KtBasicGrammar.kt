package com.asura.kotlinstudy

/**
 * Created by Liuxd on 2017/9/1 15:07.
 * Kotlin 基础语法
 * http://www.runoob.com/kotlin/kotlin-basic-syntax.html
 */
class KtBasicGrammar {
    fun main(args: Array<String>) {
        ALog.d(sum(1, 1).toString())
        ALog.d(sum1(1, 1).toString())
        ALog.d(sum2(2, 2).toString())
        ALog.d(sum4(4, 4).toString())//todo 输出了 kotlin.Unit ，暂时不解
        vars(1, 2, 3, 4, 5)
        val lambda: (Int, Int) -> Int = { x, y -> x + y }
        ALog.d("lambda表达式：" + lambda(1, 2).toString())
        variate()
        templateStrings()
        nullCheck()
        range()
    }

    //    函数定义使用关键字 fun，参数格式为：参数 : 类型
    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //    表达式作为函数体，返回类型自动推断：
    private fun sum1(a: Int, b: Int) = a + b

    public fun sum2(a: Int, b: Int): Int = a + b // public 方法则必须明确写出返回类型
    //    无返回值的函数(类似Java中的void)：
    private fun sum4(a: Int, b: Int): Unit {
        a + b
    }

    //    函数的变长参数可以用 vararg 关键字进行标识：
    private fun vars(vararg v: Int) {
        for (vt in v)
            ALog.d("变长参数 vararg :" + vt);
    }

    //    申明常量和变量
    private fun variate() {
//    变量定义：var 关键字
//    var <标识符> : <类型> = <初始化值>
//    常量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
//    val <标识符> : <类型> = <初始化值>

//    常量与变量都可以没有初始化值,但是在引用前必须初始化
        val a: Int = 1
//    编译器支持自动类型判断,即声明时可以不指定类型,由编译器判断。
        val b = 1       // 系统自动推断变量类型为Int
        val c: Int      // 如果不在声明时初始化则必须提供变量类型
        c = 1           // 明确赋值

        var x = 5        // 系统自动推断变量类型为Int
        x += 1           // 变量可修改
    }

    /**字符串模板*/
    private fun templateStrings() {
//        $ 表示一个变量名或者变量值
//        $varName 表示变量值
//        ${varName.fun()} 表示变量的方法返回值
        var a = "666"
        val s1 = "a is $a"
        a = "999";
        val s2 = "${s1.replace("is", "was")},but now is $a"
        ALog.d(s1)
        ALog.d(s2)
    }

    private fun nullCheck() {
//        1、字段后加!!像Java一样抛出空异常，
//        2、字段后加?可不做处理返回值为 null或配合?:做空判断处理
        var age: String? = "23"
        age = null
//        val ages = age!!.toInt() //抛出 kotlin.KotlinNullPointerException
        val ages1 = age?.toInt()
        val ages2 = age?.toInt() ?: -1
        ALog.d("ages1 :" + ages1); //ages1 :null
        ALog.d("ages2 :" + ages2);// ages2 :-1
    }

    private fun range() {
        ALog.d("循环输出：")
        for (i in 1..4) {
            ALog.d(i.toString())// [1,4]=1,2,3,4
        }
        ALog.d("设置步长 step：")
        for (i in 1..4 step 2) {
            ALog.d(i.toString())//1,3
        }
        ALog.d("使用 downTo：")
        for (i in 4 downTo 2) {
            ALog.d(i.toString())//4,3,2
        }
        ALog.d("使用 downTo + step：")
        for (i in 4 downTo 2 step 2) {
            ALog.d(i.toString())//4,2
        }
        ALog.d("使用 until：")
        for (i in 1 until 4) {
            ALog.d(i.toString())//[1,4)=1,2,3
        }
    }
}
