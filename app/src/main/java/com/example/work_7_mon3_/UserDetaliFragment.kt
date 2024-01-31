package com.example.work_7_mon3_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.work_7_mon3_.databinding.FragmentUserDetaliBinding


class UserDetaliFragment : Fragment() {
    private lateinit var binding: FragmentUserDetaliBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserDetaliBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = arguments?.getSerializable(KEYS.BUNDLE_KEY_USER) as User
        binding.apply {
            imgAvatar1.loadImage(user.avatar)
            tvUserName1.text = user.userName
            quote1.text = user.profession
        }
    }


}