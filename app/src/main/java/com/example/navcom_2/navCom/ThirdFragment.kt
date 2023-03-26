package com.example.navcom_2.navCom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcom_2.R
import com.example.navcom_2.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {


    lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater,container,false)

        binding.tvThree.setOnClickListener {
            findNavController().navigate(R.id.fourFragment)
        }

    return binding.root
    }
}