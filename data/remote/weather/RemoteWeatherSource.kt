package com.intelli.data.remote.weather

import com.intelli.data.base.remote.handleApi
import com.intelli.data.remote.ip.ApiIp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Jalaj on 17-11-2023.
 */
class RemoteWeatherSource @Inject constructor(
    var apiWeather: ApiWeather
){

    suspend fun  getCurrent(lat: Float, lon: Float) = withContext(Dispatchers.IO) {

        return@withContext handleApi { apiWeather.getCurrent(lat, lon) }


    }

    suspend fun  getForecast(lat: Float, lon: Float) = withContext(Dispatchers.IO) {

        return@withContext handleApi { apiWeather.getForecast(lat, lon) }


    }
}