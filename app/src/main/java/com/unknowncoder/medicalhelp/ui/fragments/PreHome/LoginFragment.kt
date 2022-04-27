package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentLoginBinding
import com.unknowncoder.medicalhelp.ui.activities.MainActivity

class LoginFragment : Fragment() {
    private lateinit var binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View{
        binding= FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginBtn.setOnClickListener {
            startActivity(Intent(requireActivity(),MainActivity::class.java))
            requireActivity().finish()
        }
        binding.forgetPsswd.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
        }
        binding.signUpBtn.setOnClickListener {
            val bundle=Bundle()
            bundle.putString("from","login")
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment,bundle)
        }
        binding.phoneSignInBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_loginWithPhoneFragment)
        }
    }
}