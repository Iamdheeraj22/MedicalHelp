package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.ActivityMainBinding.inflate
import com.unknowncoder.medicalhelp.databinding.FragmentLoginRegisterPhoneBinding

class LoginWithPhoneFragment : Fragment() {
    private lateinit var binding: FragmentLoginRegisterPhoneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentLoginRegisterPhoneBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sendCode.setOnClickListener {
            findNavController().navigate(R.id.action_loginWithPhoneFragment_to_verificationPhoneFragment)
        }
    }
}