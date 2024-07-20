package com.intelli.data.remote.weather.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 17-11-2023.
 */
@JsonClass(generateAdapter = true)
data class WeatherDto(val id: Int, val main: String) {
}