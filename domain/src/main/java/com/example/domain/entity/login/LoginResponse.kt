package com.example.domain.entity.login

import com.example.domain.entity.login.LoginModel
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    val status: Int,
    val message: String,
    @SerializedName("body")
    val body: LoginModel
)