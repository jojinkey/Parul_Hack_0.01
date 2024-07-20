package com.intelli.domain.identify.usecase

import android.net.Uri
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.identify.repository.IdentifyRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 27-01-2023.
 */
internal class IdentifyUseCase @Inject constructor(private var identifyRepository: IdentifyRepository)  {
    suspend operator fun invoke(organ: String, uri: Uri) = identifyRepository.identify(organ, uri)
}