package com.intelli.data.remote.weather.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 17-01-2023.
 */
@JsonClass(generateAdapter = true)
data class WeatherLocationDto(val lon: Float, val lat: Float) {
}