package com.example.domain.utils

import android.content.SharedPreferences
import androidx.core.content.edit

import com.google.gson.Gson
import okhttp3.CertificatePinner
import java.util.Locale
import javax.inject.Inject

class Prefs @Inject constructor(
    private val sharedPrefs: SharedPreferences,
) {
    var currentFragment: String?
        get() {
            return sharedPrefs.getString(AppConstants.CURRENT_FRAGMENT, null)

        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.CURRENT_FRAGMENT, value) }
        }

    var language: String?
        get() {
            return sharedPrefs.getString(
                AppConstants.defaultLanguageKey,
                Locale.getDefault().language
            )
                ?: Locale.getDefault().language
        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.defaultLanguageKey, value) }
        }

    var isLoggedIn: Boolean
        get() = sharedPrefs.getBoolean(AppConstants.isLoggedInKey, false)
        set(value) = sharedPrefs.edit {
            putBoolean(AppConstants.isLoggedInKey, value) ?: Locale.getDefault()
        }








}