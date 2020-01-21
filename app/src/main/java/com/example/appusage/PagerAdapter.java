package com.example.appusage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private static int NUMBER = 3;
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AppUsageFragment();
            case 1:
                return new AppInstalledFragment();
            case 2:
                return new AppUsageTimeFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return NUMBER;
    }
}
