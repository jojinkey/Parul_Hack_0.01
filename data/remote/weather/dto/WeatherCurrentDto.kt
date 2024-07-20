package com.intelli.data.remote.weather.dto

import com.squareup.moshi.JsonClass
import com.intelli.data.remote.weather.dto.inner.WeatherDto
import com.intelli.data.remote.weather.dto.inner.WeatherLocationDto
import com.intelli.data.remote.weather.dto.inner.WeatherMainDto

/**
 * Created by Jalaj on 17-11-2023.
 */
@JsonClass(generateAdapter = true)
data class WeatherCurrentDto(
    val id: Int,
    val coord: WeatherLocationDto,
    val weather: List<WeatherDto>,
    val main: WeatherMainDto,
    val visibility: Int,
    val dt: Int
) {
}