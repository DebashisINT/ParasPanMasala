package com.breezefsmparas.features.weather.api

import com.breezefsmparas.features.task.api.TaskApi
import com.breezefsmparas.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}