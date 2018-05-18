package com.example.mid.testandroidarchitecture

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtHelloWorld:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHelloWorld.findViewById<TextView>(R.id.helloworld)

        var liveData = MyLiveData(this)
        liveData.observe(
                this,
                Observer {
                    myData -> txtHelloWorld.text = myData?.stringValue
                }
        )

    }
}
