package com.unknowncoder.medicalhelp.ui.fragments.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentUserProfileBinding
import com.unknowncoder.medicalhelp.ui.activities.MainActivity

class UserProfileFragment : Fragment() {
    private lateinit var binding: FragmentUserProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentUserProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            editProfileBtn.setOnClickListener {
                findNavController().navigate(R.id.action_userProfileFragment_to_editProfileFragment)
            }
        }
    }
}