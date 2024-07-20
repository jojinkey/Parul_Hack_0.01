package com.intelli.data.remote.weather.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 17-01-2023.
 */
@JsonClass(generateAdapter = true)
data class WeatherForecastDayDto(val dt: Int, val main: WeatherDayTempDto,
                                 val weather: List<WeatherDto>) {
}