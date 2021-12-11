package com.neppplus.pizzaorderapp_20211211.adepters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.pizzaorderapp_20211211.fragment.MyProfileFragment
import com.neppplus.pizzaorderapp_20211211.fragment.PizzaStoreListFragment

class MainViewPagerAdapter( fm:FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2



    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"피자 주문"
            else -> "내 정보 설정"
        }
    }

}