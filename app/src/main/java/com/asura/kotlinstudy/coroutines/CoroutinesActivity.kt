package com.asura.kotlinstudy.coroutines

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.asura.kotlinstudy.MainActivity.Companion.say
import com.asura.kotlinstudy.MainActivity.Companion.toast
import com.asura.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_coroutines.*
import kotlinx.coroutines.*
import retrofit2.Retrofit

class CoroutinesActivity : AppCompatActivity() {

    private lateinit var mApiService: ApiService
    private var job: Job? = null

    private val IMG1 = "http://f.hiphotos.baidu.com/image/pic/item/0e2442a7d933c8956c0e8eeadb1373f08202002a.jpg"
    private val IMG2 = "http://a.hiphotos.baidu.com/image/pic/item/838ba61ea8d3fd1fc9c7b6853a4e251f94ca5f46.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)

        val retrofit = Retrofit.Builder()
                .baseUrl("https://github.com/Coder-Asura/")
                .build()
        mApiService = retrofit.create(ApiService::class.java)
        button.setOnClickListener {
            showPic()
        }
        button2.setOnClickListener {
            cancelJob()
        }
    }

    private fun cancelJob() {
        job?.let {
            if (it.isActive) {
                it.cancel()
            }
        }
    }

    private fun showPic() {
        job = GlobalScope.launch(Dispatchers.Main) {
            val bitmap = getPic(IMG1)
            toast("${bitmap?.height}")
            imageView.setImageBitmap(bitmap)
            delay(2000)
            val bitmap2 = getPic(IMG2)
            toast("${bitmap2?.height}")
            imageView2.setImageBitmap(bitmap2)
        }
    }

    private suspend fun getPic(url: String): Bitmap? = withContext(Dispatchers.IO) {
        val responseBody = mApiService.getImg(url).execute()
        if (responseBody.isSuccessful) {
            say("${responseBody.body()?.byteStream()?.toString()}")
            return@withContext BitmapFactory.decodeStream(responseBody.body()?.byteStream())
        }
        null
    }

    override fun onDestroy() {
        super.onDestroy()
        cancelJob()
    }

}