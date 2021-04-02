package com.example.retrofitexampler

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.retrofitexampler.databinding.FragmentTestBinding

class TestFragment:Fragment(R.layout.fragment_test) {
    private lateinit var  binding:FragmentTestBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentTestBinding.bind(view)
        binding.tvHelloWorld
    }
}