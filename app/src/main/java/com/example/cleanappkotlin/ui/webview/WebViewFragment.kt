package com.example.cleanappkotlin.ui.webview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cleanappkotlin.R
import com.example.cleanappkotlin.databinding.FragmentWebViewBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WebViewFragment : Fragment() {
    lateinit var binding: FragmentWebViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentWebViewBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showWebView("https://tamatemplus.com/home")
        setUpOnclick()

    }
    fun showWebView(url: String){
        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl(url)
        val webSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true
    }

    inner class WebViewClient : android.webkit.WebViewClient() {

        // Load the URL
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return false
        }

        // ProgressBar will disappear once page is loaded
        override fun onPageFinished(view: WebView, url: String) {
            super.onPageFinished(view, url)
            binding.progressBar.visibility = View.GONE
        }
    }
    fun setUpOnclick(){
        binding.btnClose.setOnClickListener {
            findNavController().navigate(R.id.action_webViewFragment_to_homeFragment)
            binding.webView.canGoBack()

        }
        binding.btnForward.setOnClickListener {

            showWebView("https://tamatemplus.com/all/games")
        }
        binding.btnBack.setOnClickListener {
            showWebView("https://tamatemplus.com/home")
        }
        binding.btnRefresh.setOnClickListener {
            binding.webView.reload()

        }
    }


}