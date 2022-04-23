package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentLoginRegisterPhoneBinding
import com.unknowncoder.medicalhelp.databinding.FragmentVerificationPhoneBinding

class VerificationPhoneFragment : Fragment() {
    private lateinit var binding: FragmentVerificationPhoneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentVerificationPhoneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_verificationPhoneFragment_to_loginWithPhoneFragment)
        }

        binding.verifyCodeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_verificationPhoneFragment_to_registerFragment)
        }
    }
}