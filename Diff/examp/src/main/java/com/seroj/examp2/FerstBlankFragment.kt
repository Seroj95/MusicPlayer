package com.seroj.examp2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.seroj.examp2.databinding.FragmentFerstBlankBinding

class FerstBlankFragment:Fragment(R.layout.fragment_ferst_blank) {
   private lateinit var binding: FragmentFerstBlankBinding

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
  super.onViewCreated(view, savedInstanceState)
  binding= FragmentFerstBlankBinding.bind(view)
  binding.btnOne.setOnClickListener {
   Navigation.findNavController(view).navigate(R.id.action_ferstBlankFragment_to_secondBlankFragment)

  }
 }
}