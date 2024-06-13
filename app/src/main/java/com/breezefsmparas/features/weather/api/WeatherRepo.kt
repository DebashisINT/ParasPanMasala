package com.breezefsmparas.features.weather.api

import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.task.api.TaskApi
import com.breezefsmparas.features.task.model.AddTaskInputModel
import com.breezefsmparas.features.weather.model.ForeCastAPIResponse
import com.breezefsmparas.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}