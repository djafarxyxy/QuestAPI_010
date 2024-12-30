package com.example.tugas10

import android.app.Application
import com.example.tugas10.container.AppContainer
import com.example.tugas10.container.MahasiswaContainer


class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}
