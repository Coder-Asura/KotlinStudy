package com.asura.kotlinstudy

/**
 * Created by Liuxd on 2017/9/4 13:52.
 * 基础数据类型
 * http://www.runoob.com/kotlin/kotlin-basic-types.html
 */
class KtBasicDataType {
    fun main(args: Array<String>) {
        basic()
        compare()
        convertType()
        bitOperation()
        array()
        //字符串
        val text = "我是一个字符串"
        val textLong = """
            |我是一个多行字符串1
            |我是一个多行字符串2
            |我是一个多行字符串3
            |我是一个多行字符串4
            我是一个多行字符串5
        """
        ALog.d(text)
        ALog.d(textLong)//输出有一些前置空格
        ALog.d(textLong.trimMargin("|我"))//输出如下：
//        是一个多行字符串1
//        是一个多行字符串2
//        是一个多行字符串3
//        是一个多行字符串4
//                    我是一个多行字符串5
    }

    private fun basic() {
//        不同于Java的是，字符不属于数值类型，是一个独立的数据类型。
        val d: Double = 123.4//64位
        val f: Float = 123.4f//32位
        val l: Long = 123456789123456789L//64位
        val i: Int = 123456789//32位
        val s: Short = 1234//16位
        val b: Byte = 1//8位

//        可以使用下划线使数字常量更易读
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
    }

    private fun compare() {
        val a: Int = 1000
//        在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
        ALog.d((a === a).toString()) // true，值相等，对象地址相等
        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        ALog.d(((boxedA === anotherBoxedA).toString()))//  false，值相等，对象地址不一样
        ALog.d(((boxedA == anotherBoxedA).toString())) // true，值相等
//      注意：这里把 a 的值换成 100，这里应该跟 Java 中是一样的，在范围是 [-128, 127] 之间并不会创建新的对象，比较输出的都是 true，
//      从 128 开始，比较的结果才为 false。
    }

    private fun convertType() {
        val b: Byte = 1
//        val i: Int = b //类型错误
        val i: Int = b.toInt()
//        每种数据类型都有下面的这些方法，可以转化为其它的类型：
//        toByte(): Byte
//        toShort(): Short
//        toInt(): Int
//        toLong(): Long
//        toFloat(): Float
//        toDouble(): Double
//        toChar(): Char

//        有些情况下也是可以使用自动类型转化的，前提是可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载。
        val l = 1L + 3 // Long + Int => Long
        ALog.d("l is Long：" + (l is Long).toString())
    }

    private fun bitOperation() {
        val a = 0b10001001
        val b = 0b11001100
        ALog.d("位运算 a:" + a.toString() + "  b:" + b.toString())
        ALog.d("shl(bits) – 左移位 (Java’s <<)：" + a.shl(2))
        ALog.d("shr(bits) – 右移位 (Java’s >>)：" + a.shr(2))
        ALog.d("ushr(bits) – 无符号右移位 (Java’s >>>)：" + a.ushr(2))
        ALog.d("and(bits) – 与：" + a.and(b))
        ALog.d("or(bits) – 或：" + a.or(b))
        ALog.d("xor(bits) – 异或：" + a.xor(b))
        ALog.d("inv() – 非：" + a.inv())
    }

    private fun array() {
        val a = arrayOf(1, 2, 3)
        val b = Array(3, { i -> (1 * 2) })
        ALog.d("arrayOf 创建数组：" + a.size)
        ALog.d("Array() 创建数组：" + b.size)
        val x = intArrayOf(1, 2, 3, 4)
        val y = byteArrayOf(1, 2, 3, 4)
        ALog.d("intArrayOf() 创建数组：" + x.size)
    }

}
