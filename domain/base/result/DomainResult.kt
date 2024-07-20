package com.intelli.domain.base.result

/**
 * Created by Jalaj on 21-12-2022.
 */
sealed interface DomainResult<out T> {
    data class Success<T>(val value: T) : DomainResult<T>
    data class Failure(val throwable: Throwable? = null) : DomainResult<Nothing>
}