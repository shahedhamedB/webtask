package com.example.cleanappkotlin.di

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.cleanappkotlin.dei.interceptors.LanguageInterceptor
import com.example.data.remote.ApiService
import com.example.domain.utils.AppConstants.Companion.BASE_URL
import com.example.domain.utils.Prefs

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson, prefs: Prefs): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(getLanguageHeaderOkHttpClient(prefs))
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    // Step 1: Create or retrieve the Master Key for encryption/decryption

    // Step 2: Initialize/open an instance of EncryptedSharedPreferences
    @Provides
    @Singleton
    fun provideSharedPreferences(context: Application):  SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    fun provideNetworkService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)

    /**
     * OkHttpClient
     */

    @Provides
    @Singleton
    fun getLanguageHeaderOkHttpClient(prefs: Prefs): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.addInterceptor(HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.HEADERS
            this.level = HttpLoggingInterceptor.Level.BODY
        })

            .addInterceptor(LanguageInterceptor(prefs))
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
        return builder.build()
    }
}

