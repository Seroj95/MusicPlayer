package com.seroj.examp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroj.examp2.databinding.FragmentSecondBlankBinding


class SecondBlankFragment : Fragment(R.layout.fragment_second_blank) {
   private lateinit var binding: FragmentSecondBlankBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentSecondBlankBinding.bind(view)
        binding.btnTwo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondBlankFragment_to_ferstBlankFragment)

        }
    }
}