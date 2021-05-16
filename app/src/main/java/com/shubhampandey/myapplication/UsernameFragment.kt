package com.shubhampandey.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_username.*

class UsernameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_username, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        next_Btn.setOnClickListener {
            if (mobileNumber_TIL.editText?.text.isNullOrEmpty()) {
                mobileNumber_TIL.error = "${getString(R.string.ten_digit_mobile)} required"
            }
            else {
                mobileNumber_TIL.error = null
                val action =
                    UsernameFragmentDirections.actionUsernameFragmentToUserPasswordFragment()
                findNavController().navigate(action)
            }
        }
    }
}