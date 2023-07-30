package com.example.domain.usecase

import com.example.domain.utils.BaseDataSource
import com.example.domain.repo.AuthRepo

class UserAuth(private val authRepo: AuthRepo) : BaseDataSource() {
    suspend fun userLogin(
        password: String,
        username: String,
        accountType:String
    ) = getResult {
        authRepo.userLoginFromRemote(password, username,accountType)
    }


}
