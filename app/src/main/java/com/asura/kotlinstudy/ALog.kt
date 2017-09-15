package com.asura.kotlinstudy

import android.util.Log

/**
 * Created by Liuxd on 2017/9/14 14:08.
 * 日志类
 */
object ALog {
    //    companion object {//大括号里的全是静态方法
    private val TAG: String = "Asura"

    fun d(msg: String) {
        Log.d(TAG, msg)
    }
//    }

}
