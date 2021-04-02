package com.seroj.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroj.example.databinding.FragmentTwoBinding


class TwoFragment : Fragment(R.layout.fragment_two) {
    private lateinit var binding: FragmentTwoBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentTwoBinding.bind(view)
        binding.button2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twoFragment_to_oneFragment)

        }
    }
}