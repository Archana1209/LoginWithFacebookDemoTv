package com.example.loginwithfacebookdemotv

import android.app.Application

class DemoAppApplication : Application() {

    init {
        demoAppApplication = this
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        private var demoAppApplication: DemoAppApplication? = null
        fun getInstance(): DemoAppApplication? {
            return demoAppApplication
        }
    }

}
