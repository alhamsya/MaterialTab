package com.example.alhamsya.materialtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.alhamsya.materialtab.fragment.Tab1Fragment;
import com.example.alhamsya.materialtab.fragment.Tab2Fragment;

/**
 * Created by Alhamsya on 13/11/2016.
 */

public class TabFragmentPageAdapter extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}