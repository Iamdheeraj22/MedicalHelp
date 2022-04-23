package com.unknowncoder.medicalhelp.ui.fragments.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.unknowncoder.medicalhelp.R
import com.unknowncoder.medicalhelp.databinding.FragmentHomeBinding
import com.unknowncoder.medicalhelp.ui.activities.MainActivity

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.profileBtn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_userProfileFragment)
        }
        binding.addRecordButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_medicalRecordsFragment)
        }

        binding.userCardview.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_userProfileFragment)
        }
    }
}