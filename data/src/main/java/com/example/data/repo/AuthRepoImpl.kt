package com.example.data.repo


import com.example.data.remote.ApiService
import com.example.domain.entity.login.LoginRequest
import com.example.domain.entity.login.LoginResponse
import com.example.domain.repo.AuthRepo
import retrofit2.Response


class AuthRepoImpl(private val networkService: ApiService) : AuthRepo {

    override suspend fun userLoginFromRemote(
        password: String,
        username: String,
        accountType:String
    ): Response<LoginResponse?> = networkService.userLogin(LoginRequest(password, username,accountType))


}
