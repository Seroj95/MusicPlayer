package com.seroj.diff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroj.diff.databinding.FragmentFirestBinding
import kotlinx.android.synthetic.main.fragment_firest.view.*

class FirestFragment : Fragment(R.layout.fragment_firest) {
private lateinit var binding: FragmentFirestBinding

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding= FragmentFirestBinding.bind(view)
            binding.btnText.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_firestFragment_to_secondFragment)

            }
        }


    }



