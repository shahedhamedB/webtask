package com.example.domain.entity.login

data class LoginRequest(
    val password: String,
    val username: String,
    val accountType :String
)