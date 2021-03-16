package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter (activity: MainActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return HomeFragment.newInstance(position + 1)
    }

    override fun getItemCount(): Int {
        return 3
    }
}