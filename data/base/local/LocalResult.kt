package com.intelli.data.base.local

/**
 * Created by Jalaj on 21-12-2023.
 */
sealed interface LocalResult<T> {

    class Success<T>(val data: T) : LocalResult<T>

    class Message<T>(val code: Int, val message: String?) : LocalResult<T>

    class Exception<T>(val throwable: Throwable): LocalResult<T>


}