package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentRegisterBinding
import com.unknowncoder.medicalhelp.databinding.FragmentVerificationPhoneBinding
import com.unknowncoder.medicalhelp.util.showToast

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        binding.signUpBtn.setOnClickListener {
           showToast(requireActivity(),"Your account is created successfully , please verify your email....")
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }
}