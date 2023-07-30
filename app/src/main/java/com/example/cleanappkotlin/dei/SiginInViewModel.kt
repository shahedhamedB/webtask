package com.example.cleanappkotlin.dei

import android.annotation.SuppressLint

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.domain.entity.login.LoginResponse
import com.example.domain.usecase.UserAuth
import com.example.domain.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class SiginInViewModel @Inject constructor(
    private  val userLoginUseCase: UserAuth

) : ViewModel() {
    private val _login: MutableStateFlow <Resource<LoginResponse?>?>?= MutableStateFlow(null)
    val login: StateFlow<Resource<LoginResponse?>?>? = _login

    @SuppressLint("SuspiciousIndentation")
    fun userLogin(
        password: String,
        username: String,
        accountType:String
    ) {

        viewModelScope.launch {
            val response = userLoginUseCase.userLogin(password, username,accountType)
            _login?.emit(response)

        }
    }



}