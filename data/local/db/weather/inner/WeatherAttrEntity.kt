package com.intelli.data.local.db.weather.inner

import com.squareup.moshi.Json

/**
 * Created by Jalaj on 19-11-2023.
 */
data class WeatherAttrEntity(
    var temp: Float?,
    val pressure: Int,
    val humidity: Int, var tempMin: Float, var tempMax: Float
) {
}