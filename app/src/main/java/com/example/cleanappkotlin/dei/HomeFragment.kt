package com.example.cleanappkotlin.dei

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.cleanappkotlin.R
import com.example.cleanappkotlin.databinding.FragmentHomeBinding
import com.example.domain.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
     val viewModel: SiginInViewModel by viewModels()


    var isNameValid = false
    var isPasswordValid = false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btnLogin.setOnClickListener {
            userLogin()
        }

    }
    fun userLogin() {
        //viewModel.userLogin("123456", "newshahed","biller")

        //viewModel.userLogin("1234", "9988770004","biller")
        // viewModel.userLogin("123456", "mkamleh","biller")
        // viewModel.userLogin("1234567A", "shahed123", "biller")
        viewModel.userLogin("123456", "9988770002","biller")
        //viewModel.userLogin(binding.passwordEdt.text.toString(), binding.usernameEdt.text.toString(),"biller")
        lifecycleScope.launch {
            viewModel.login?.collect {
                when (it?.status) {
                    Resource.Status.SUCCESS -> {
                        Toast.makeText(requireContext(), "sucess", Toast.LENGTH_SHORT).show()


                    }

                    Resource.Status.ErrorRes -> {
                        Toast.makeText(
                            requireContext(),
                            it.errorResponse!!.message,
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }

                    Resource.Status.ERROR -> {
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                }

            }
        }
    }





}