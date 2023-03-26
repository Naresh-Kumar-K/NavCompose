package com.example.navcom_2.navCom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navcom_2.R
import com.example.navcom_2.databinding.FragmentFiveBinding

class FiveFragment : Fragment() {

    lateinit var binding: FragmentFiveBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFiveBinding.inflate(layoutInflater, container, false)


        binding.tvFive.setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {

                override fun handleOnBackPressed() {

                        findNavController().navigate(R.id.action_fiveFragment_to_secondFragment)
                }
            })
    }
}