package com.example.navcom_2.navCom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcom_2.R
import com.example.navcom_2.databinding.FragmentFourBinding

class FourFragment : Fragment() {
    lateinit var binding: FragmentFourBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentFourBinding.inflate(layoutInflater,container,false)

        binding.tvFour.setOnClickListener {
            findNavController().navigate(R.id.fiveFragment)
        }
    return binding.root
    }
}