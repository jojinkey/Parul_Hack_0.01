package com.intelli.data.remote.weather.dto

import com.squareup.moshi.JsonClass
import com.intelli.data.remote.weather.dto.inner.WeatherCityDto
import com.intelli.data.remote.weather.dto.inner.WeatherForecastDayDto

/**
 * Created by Jalaj on 17-01-2023.
 */
@JsonClass(generateAdapter = true)
data class WeatherForecastDto(
//    val city: WeatherCityDto,
    val cnt: Int,
    val list: List<WeatherForecastDayDto>) {

}