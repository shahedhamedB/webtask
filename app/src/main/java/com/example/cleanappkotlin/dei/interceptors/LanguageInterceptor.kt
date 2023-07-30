package com.example.cleanappkotlin.dei.interceptors

import com.example.domain.utils.Prefs
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class LanguageInterceptor @Inject constructor(
    private val prefs: Prefs,

    ) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(
            chain.request().newBuilder()
                //.addHeader("x-auth-token","")
                .addHeader(
                    "lang",
                    prefs.language ?: "en"
                ).build()
        )

}