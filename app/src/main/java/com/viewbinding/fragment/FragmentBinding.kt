package com.viewbinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.viewbinding.R
import com.viewbinding.databinding.FragmentBindingBinding

class FragmentBindingTest : Fragment() {

    private var binding: FragmentBindingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBindingBinding.inflate(inflater, container, false)

        // TextView
        binding!!.textView.text = "View Binding TextView Example"
        // ImageView
        binding!!.imageView.setImageResource(R.drawable.ic_launcher_background)

        return binding!!.root
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

}