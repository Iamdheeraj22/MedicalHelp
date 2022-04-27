package com.unknowncoder.medicalhelp.ui.fragments.PreHome

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentRegisterBinding
import com.unknowncoder.medicalhelp.databinding.FragmentVerificationPhoneBinding
import com.unknowncoder.medicalhelp.util.showToast

class RegisterFragment : Fragment() {
    private var gender=""
    private lateinit var binding: FragmentRegisterBinding
    private lateinit var firebaseAuth:FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentRegisterBinding.inflate(inflater,container,false)
        firebaseAuth= FirebaseAuth.getInstance()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val from= requireArguments().getString("from")
        if(!from.equals("login")){
             binding.etPassword.visibility=View.GONE
             binding.etConfirmpassword.visibility=View.GONE
             binding.googleSignUpBtn.visibility=View.GONE
             binding.loginButton.visibility=View.GONE
        }

        binding.genderMale.setOnClickListener {
            gender="male"
            binding.genderMale.setBackgroundResource(R.drawable.common_button_bck)
            binding.maleText.setTextColor(Color.WHITE)
            binding.genderfeMale.setBackgroundResource(R.drawable.custom_editext)
            binding.feMaleText.setTextColor(Color.BLACK)
        }

        binding.genderfeMale.setOnClickListener {
            gender="female"
            binding.genderMale.setBackgroundResource(R.drawable.custom_editext)
            binding.maleText.setTextColor(Color.BLACK)
            binding.genderfeMale.setBackgroundResource(R.drawable.common_button_bck)
            binding.feMaleText.setTextColor(Color.WHITE)
        }

        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        binding.signUpBtn.setOnClickListener {
            val name= binding.etFullname.text!!.trim().toString()
            val email= binding.etEmail.text!!.trim().toString()
            val pCreate= binding.etPassword.text!!.trim().toString()
            val pConfirm= binding.etConfirmpassword.text!!.trim().toString()

            if(name.isEmpty()) showToast(requireActivity(),"fill the name..")
            else if(email.isEmpty()) showToast(requireActivity(),"fill the email..")
            else if(pCreate.isEmpty()) showToast(requireActivity(),"create the password..")
            else if(pConfirm.isEmpty()) showToast(requireActivity(),"fill the confirm password..")
            else if(pConfirm!=pCreate) showToast(requireActivity(),"password dosen't match..")
            else if(pConfirm.length<6 || pCreate.length<6) showToast(requireActivity(),"password at least 6 digits long..")
            else if(gender.isEmpty()) showToast(requireActivity(),"select the gender...")
            else RegisterUser(name,email,pConfirm);


            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }

    private fun RegisterUser(name: String, email: String, pConfirm: String) {

    }
}