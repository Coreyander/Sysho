
package com.systematicshoppers.sysho.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.systematicshoppers.sysho.R
import com.systematicshoppers.sysho.activities.MainActivity

class SearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val shopBtn = view.findViewById<Button>(R.id.shopBtn)
        val navBar: BottomNavigationView? = activity?.findViewById(R.id.bottomNavigationView)
        navBar?.isVisible = false

        shopBtn.setOnClickListener {
            navBar?.isVisible = true
            view.findNavController().navigate(R.id.action_searchFragment_to_resultsFragment)
        }



        return view
    }
}