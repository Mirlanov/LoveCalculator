package com.example.lovecalculator

import android.app.Application
import androidx.room.Room
import com.example.lovecalculator.model.room.AppDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appDatabase =
            Room.databaseBuilder(applicationContext, AppDatabase::class.java, "love.database")
                .allowMainThreadQueries().build()
    }

    companion object {
        lateinit var appDatabase: AppDatabase
    }
}