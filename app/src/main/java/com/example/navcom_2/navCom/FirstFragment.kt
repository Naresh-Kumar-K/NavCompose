package com.example.navcom_2.navCom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcom_2.R
import com.example.navcom_2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var bind: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
         bind = FragmentFirstBinding.inflate(layoutInflater,container,false)

        bind.tvOne.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }

        return bind.root
    }

}