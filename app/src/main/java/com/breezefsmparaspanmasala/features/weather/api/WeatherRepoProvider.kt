package com.breezefsmparaspanmasala.features.weather.api

import com.breezefsmparaspanmasala.features.task.api.TaskApi
import com.breezefsmparaspanmasala.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}