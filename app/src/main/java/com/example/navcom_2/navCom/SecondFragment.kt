package com.example.navcom_2.navCom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcom_2.R
import com.example.navcom_2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        binding.tvTwo.setOnClickListener {

            findNavController().navigate(R.id.thirdFragment)
        }
        return binding.root
    }
}