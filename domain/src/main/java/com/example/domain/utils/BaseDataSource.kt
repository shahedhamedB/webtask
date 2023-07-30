package com.example.domain.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.TimeoutCancellationException
import retrofit2.Response
import timber.log.Timber

abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Resource<T> {
      /*  try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    return Resource.success(body)
                }

            } else {
                val gson = Gson()
                val type = object : TypeToken<ErrorResponse>() {}.type
                val errorResponse: ErrorResponse? =
                    gson.fromJson(response.errorBody()?.charStream(), type)
                  Resource.errorRes("nckdssf", errorResponse, errorResponse)
            }
            return error(" ${response.code()} ${response.message()}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }*/


        return try {
            val response = call()
            if (response.isSuccessful) {
                val result = response.body()
                if (result != null) {
                    Resource.success(result)
                } else {
                    Resource.error("")
                }
            } else {
                val gson = Gson()
                val type = object : TypeToken<ErrorResponse>() {}.type
                val errorResponse: ErrorResponse? =
                    gson.fromJson(response.errorBody()?.charStream(), type)
                Resource.errorRes("", null, errorResponse)
            }
        } catch (e: TimeoutCancellationException) {
            Resource.error(e.message.toString())
        } catch (e: Exception) {
            Resource.error(e.message ?: "An error occurred")
        }

    }

    private fun <T> error(message: String): Resource<T> {
        Timber.d(message)
        return Resource.error("", null)
    }

}