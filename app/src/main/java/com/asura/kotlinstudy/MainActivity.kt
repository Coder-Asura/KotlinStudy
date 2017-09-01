package com.asura.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG: String? = "Asura"
    private var mRv_ktSkill: RecyclerView? = null
    private var mLayoutManager: LinearLayoutManager? = null
    private var mAdapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRv_ktSkill = findViewById(R.id.rv_ktSkill) as RecyclerView
        initRv()
    }

    private fun initRv() {
        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mAdapter = MyAdapter(resources.getStringArray(R.array.skill_names)
                , MyAdapter.CallBack { itemView, position ->
            Toast.makeText(this, "" + position, Toast.LENGTH_SHORT).show()
            doSomeThing(position)
        })
        mRv_ktSkill!!.layoutManager = mLayoutManager
        mRv_ktSkill!!.adapter = mAdapter
    }

    private fun doSomeThing(position: Int) {
        if (position == 0) {
            say("World")
        } else if (position == 1) {
            val ktBasicGrammar: KtBasicGrammar = KtBasicGrammar()
            val empty = emptyArray<String>()
            ktBasicGrammar.main(empty)
        }
    }

    private fun say(msg: String) {
        Log.d(TAG, "Hello $msg")
    }
}
