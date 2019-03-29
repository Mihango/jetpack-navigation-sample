package com.techmashinani.navigation_sample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.techmashinani.navigation_sample.R
import kotlinx.android.synthetic.main.fragment_request.*


class RequestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_request, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_ok.setOnClickListener {
            val action: RequestFragmentDirections.ActionRequestFragmentToDisplayFragment = RequestFragmentDirections.actionRequestFragmentToDisplayFragment()
            action.username = edit_username.text.toString()
            action.salute = edit_salute.text.toString()
            findNavController().navigate(action)
        }
    }

}
