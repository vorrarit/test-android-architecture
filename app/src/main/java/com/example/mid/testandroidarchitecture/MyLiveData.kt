package com.example.mid.testandroidarchitecture

import android.arch.lifecycle.LiveData
import android.content.Context
import android.support.v7.app.AppCompatActivity

class MyLiveData(activity: AppCompatActivity):LiveData<MyData>() {

    var appState:String = "unknown"
    var lifecycleObserver: MyLifecycleObserver

    init {
        lifecycleObserver = MyLifecycleObserver(activity.lifecycle)
        activity.lifecycle.addObserver(lifecycleObserver)
    }

    override fun onActive() {
        value = MyData(lifecycleObserver.applicationState)
    }
}