package com.asura.kotlinstudy

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import android.widget.Toast
import com.asura.kotlinstudy.coroutines.CoroutinesActivity
import com.asura.kotlinstudy.coroutines.KtCoroutines
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mLayoutManager: LinearLayoutManager? = null
    private var mAdapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRv()
    }

    private fun initRv() {
        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mAdapter = MyAdapter(resources.getStringArray(R.array.skill_names)
                , MyAdapter.CallBack { itemView, position ->
            toast("$position--->${(itemView as TextView).text}")
            doSomeThing(position)
        })
        rv_ktSkill.layoutManager = mLayoutManager
        rv_ktSkill.adapter = mAdapter
    }

    private fun doSomeThing(position: Int) {
        val positions = resources.getIntArray(R.array.skill_position)
        when (position) {
            positions[0] -> say("World")
            positions[1] -> KtBasicGrammar().main(emptyArray())
            positions[2] -> KtBasicDataType().main(emptyArray())
            positions[3] -> KtConditionControl().main(emptyArray())
            positions[4] -> KtLoopControl().main(emptyArray())
            positions[5] -> KtClassAndObject().main()
            positions[6] -> KtExtends().main()
            positions[7] -> KtInterface().main()
            positions[15] -> {
                startActivity(Intent(MainActivity@ this, CoroutinesActivity::class.java))
            }
        }
    }


    //扩展函数
    companion object {
        fun Activity.toast(msg: String) = run { Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() }
        fun say(msg: String) {
            ALog.d("Hello $msg")
        }

    }
}
