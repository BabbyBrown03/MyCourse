package com.example.mycourse

import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity):
    FragmentStateAdapter(activity){

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MateriFragment()
            1 -> fragment = QuizFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {

        return 2
    }
}