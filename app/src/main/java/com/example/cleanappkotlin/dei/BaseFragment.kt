package com.example.cleanappkotlin.dei

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.domain.utils.Prefs

import java.util.*
import javax.inject.Inject

abstract class BaseFragment() : Fragment() {

    @Inject
    lateinit var prefs: Prefs


    fun setApplicationLanguage(newLanguage: String) {
        val activityRes: Resources = resources
        val activityConf: Configuration = activityRes.configuration
        val newLocale = Locale(newLanguage)
        activityConf.setLocale(newLocale)
        activityRes.updateConfiguration(activityConf, activityRes.displayMetrics)
        val applicationRes = requireContext().resources
        val applicationConf: Configuration = applicationRes.configuration
        applicationConf.setLocale(newLocale)
        applicationRes.updateConfiguration(
            applicationConf,
            applicationRes.displayMetrics
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}