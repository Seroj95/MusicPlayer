package com.seroj.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroj.example.databinding.FragmentOneBinding

class OneFragment : Fragment(R.layout.fragment_one) {
    private lateinit var binding: FragmentOneBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentOneBinding.bind(view)
        binding.button1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_twoFragment)

        }
    }
}