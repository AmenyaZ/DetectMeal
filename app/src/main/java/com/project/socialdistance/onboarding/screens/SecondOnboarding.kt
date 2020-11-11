package com.project.socialdistance.onboarding.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.socialdistance.R
import kotlinx.android.synthetic.main.fragment_second_onboarding.*
import kotlinx.android.synthetic.main.fragment_second_onboarding.view.*
import kotlinx.android.synthetic.main.fragment_splash_screen.view.*

class SecondOnboarding : Fragment() {
    var myview: View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        myview = inflater.inflate(R.layout.fragment_second_onboarding, container, false)

        myview!!.SecondIV.visibility = View.INVISIBLE
        // Inflate the layout for this fragment
        return myview
    }


    override fun onResume() {
        super.onResume()
        myview!!.SecondIV.visibility = View.VISIBLE
        val anim =
            android.view.animation.AnimationUtils.loadAnimation(requireContext(), R.anim.bounce)
        myview?.SecondIV?.startAnimation(anim)
        Log.d("FragSec", "resume")

    }

    override fun onPause() {
        super.onPause()
        myview!!.SecondIV.visibility = View.INVISIBLE
        Log.d("FragSec", "pause")

    }


}