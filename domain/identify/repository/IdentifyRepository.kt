package com.intelli.domain.identify.repository

import android.net.Uri
import androidx.paging.PagingData
import com.intelli.data.local.db.plant.PlantSearchEntryEntity
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.identify.model.ModelIdentified
import kotlinx.coroutines.flow.Flow

/**
 * Created by Jalaj on 26-01-2023.
 */
interface IdentifyRepository {

    suspend fun identify(organ: String, uri: Uri): DomainResult<ModelIdentified>
    suspend fun isAllowed(): DomainResult<Boolean>
}