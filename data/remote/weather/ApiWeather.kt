package com.intelli.data.remote.weather

import com.intelli.BuildConfig
import com.intelli.data.remote.ip.dto.IpDto
import com.intelli.data.remote.weather.dto.WeatherCurrentDto
import com.intelli.data.remote.weather.dto.WeatherForecastDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Jalaj on 17-11-2023.
 */
interface ApiWeather {


    @GET("weather")
    suspend fun getCurrent( @Query("lat") lat: Float,  @Query("lon") lon: Float,
                            @Query("appid") appId: String = BuildConfig.weatherKey
    ): Response<WeatherCurrentDto>

    @GET("forecast")
    suspend fun getForecast( @Query("lat") lat: Float,  @Query("lon") lon: Float,
//                             @Query("cnt") count: Int = 10,
                            @Query("appid") appId: String = BuildConfig.weatherKey
    ): Response<WeatherForecastDto>
}