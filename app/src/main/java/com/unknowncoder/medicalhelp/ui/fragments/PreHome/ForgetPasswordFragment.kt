package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentForgetPasswordBinding
import com.unknowncoder.medicalhelp.util.showToast

class ForgetPasswordFragment : Fragment() {
    private lateinit var binding:FragmentForgetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding= FragmentForgetPasswordBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sendResetLink.setOnClickListener {
            showToast(requireActivity(),"Reset link send your email, please check..")
            findNavController().navigate(R.id.action_forgetPasswordFragment_to_loginFragment)
        }
    }
}