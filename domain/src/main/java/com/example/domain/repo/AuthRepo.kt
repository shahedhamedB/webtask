package com.example.domain.repo


import com.example.domain.entity.login.LoginResponse
import retrofit2.Response


interface AuthRepo {
    suspend fun userLoginFromRemote(
        password: String,
        username: String,
        accountType:String
    ): Response<LoginResponse?>




}