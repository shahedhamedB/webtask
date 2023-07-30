package com.example.cleanappkotlin.di

import com.example.domain.repo.AuthRepo
import com.example.domain.usecase.UserAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UserCaseModule {
    @JvmStatic
    @Provides
    fun provideAuthUseCase(repo: AuthRepo): UserAuth {
        return UserAuth(repo)
    }
}