package com.example.data.remote

import com.example.domain.entity.login.LoginRequest
import com.example.domain.entity.login.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @Headers("SERVICE_WRAPPER: WRMJDB_003")
    @POST("redirect")
    suspend fun userLogin(@Body loginRequest: LoginRequest): Response<LoginResponse?>
}