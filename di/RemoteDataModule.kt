package com.intelli.di

import com.intelli.domain.identify.impl.DefaultIdentifyRepository
import com.intelli.domain.identify.repository.IdentifyRepository
import com.intelli.domain.plant.impl.DefaultPlantRepository
import com.intelli.domain.plant.repository.PlantRepository
import com.intelli.domain.weather.impl.DefaultWeatherRepository
import com.intelli.domain.weather.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

/**
 * Created by Jalaj on 16-01-2023.
 */
@Module
@InstallIn(ViewModelComponent::class)
abstract class RemoteDataModule {
    @Binds
    abstract fun bindWeatherRepository(impl: DefaultWeatherRepository): WeatherRepository
    @Binds
    abstract fun bindPlantRepository(impl: DefaultPlantRepository): PlantRepository

    @Binds
    abstract fun bindIdentifyRepository(impl: DefaultIdentifyRepository): IdentifyRepository

}