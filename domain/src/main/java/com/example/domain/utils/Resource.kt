package com.example.domain.utils

data class Resource<out T>(val status: Status, val data: T?, val message: String?, val errorResponse: ErrorResponse?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING,
        ErrorRes
    }

    companion object {
        fun <T> success(data: T): Resource<T> {
            return Resource(Status.SUCCESS, data,"",null)
        }

        fun <T> error(message: String, data: T? = null): Resource<T> {
            return Resource(Status.ERROR, data, message,null)
        }

        fun <T> loading(data: T? = null): Resource<T> {
            return Resource(Status.LOADING, data, "",null)
        }

        fun <T> errorRes(message: String, data: T? = null,errorResponse: ErrorResponse?) : Resource<T> {
            return  Resource(Status.ErrorRes, data, message,errorResponse)
        }
    }
}