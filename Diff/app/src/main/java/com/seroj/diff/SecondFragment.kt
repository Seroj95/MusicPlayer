package com.seroj.diff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.seroj.diff.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment(R.layout.fragment_second) {
private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding= FragmentSecondBinding.bind(view)
       binding.btnText2.setOnClickListener {
            Navigation. findNavController(view).navigate(R.id.action_secondFragment_to_firestFragment)
    }
    }
}