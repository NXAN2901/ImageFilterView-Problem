package com.playground.splash

import android.os.Handler
import androidx.navigation.fragment.findNavController
import com.playground.base.BaseFragment
import com.playground.splash.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment(R.layout.fragment_splash) {
    override fun setUp() {
        Handler().postDelayed({
            findNavController().navigate(R.id.splashToHome)
        }, 2000)
    }
}