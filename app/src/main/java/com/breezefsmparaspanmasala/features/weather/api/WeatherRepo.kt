package com.breezefsmparaspanmasala.features.weather.api

import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.task.api.TaskApi
import com.breezefsmparaspanmasala.features.task.model.AddTaskInputModel
import com.breezefsmparaspanmasala.features.weather.model.ForeCastAPIResponse
import com.breezefsmparaspanmasala.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}