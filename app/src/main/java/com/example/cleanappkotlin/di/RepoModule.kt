package com.example.cleanappkotlin.di

import com.example.data.remote.ApiService
import com.example.data.repo.AuthRepoImpl
import com.example.domain.repo.AuthRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @JvmStatic
    @Provides
    fun provideAuthRepo(networkService: ApiService): AuthRepo {
        return AuthRepoImpl(networkService)
    }
}