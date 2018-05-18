package com.example.mid.testandroidarchitecture

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class MyLifecycleObserver(val lifecycle:Lifecycle): LifecycleObserver {

    lateinit var applicationState:String

    companion object {
        val TAG:String = MyLifecycleObserver::class.java.toString()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        Log.d(TAG, "on start")
        applicationState = "start"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        Log.d(TAG, "on stop")
        applicationState = "stop"
    }


}