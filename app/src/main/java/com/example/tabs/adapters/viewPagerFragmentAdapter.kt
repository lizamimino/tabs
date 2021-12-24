package com.example.tabs.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabs.fragments.FragmentFirst
import com.example.tabs.fragments.FragmentSecond
import com.example.tabs.fragments.FragmentThird

class viewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
                0 -> FragmentFirst()
                1 -> FragmentSecond()
                2 -> FragmentThird()
            else -> FragmentFirst()

        }

    }
}