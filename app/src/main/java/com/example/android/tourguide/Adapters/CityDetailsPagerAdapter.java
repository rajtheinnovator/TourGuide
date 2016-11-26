package com.example.android.tourguide.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.Model.CityDetails;
import com.example.android.tourguide.Fragments.CityHotelsFragment;
import com.example.android.tourguide.Fragments.CityInformationFragment;
import com.example.android.tourguide.Fragments.CityMustVisitFragment;
import com.example.android.tourguide.Fragments.CityReachByFragment;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/12/2016.
 */
public class CityDetailsPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;

    private ArrayList<CityDetails> mCityDetails;
    private ArrayList<CityDetails> mCityHotels;
    private ArrayList<CityDetails> mCityReachBy;
    private ArrayList<CityDetails> mCityMustVisit;
    private String tabTitles[] = new String[]{"City Information", "Reach Here By", "Hotels", "Must Visit"};
    private Context context;

    public CityDetailsPagerAdapter(FragmentManager fm, ArrayList<CityDetails> cityDetails, ArrayList<CityDetails> cityHotels,
                                   ArrayList<CityDetails> cityReachBy, ArrayList<CityDetails> cityMustVisit) {
        super(fm);
        mCityDetails = cityDetails;
        mCityHotels = cityHotels;
        mCityReachBy = cityReachBy;
        mCityMustVisit = cityMustVisit;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Bundle args = new Bundle();
            args.putParcelableArrayList("cityDetails", mCityDetails);
            CityInformationFragment gh = new CityInformationFragment();
            gh.setArguments(args);
            return gh;
        } else if (position == 1) {
            Bundle args = new Bundle();
            args.putParcelableArrayList("cityReachBy", mCityReachBy);
            CityReachByFragment gh2 = new CityReachByFragment();
            gh2.setArguments(args);
            return gh2;
        } else if (position == 2) {
            Bundle args = new Bundle();
            args.putParcelableArrayList("cityHotels", mCityHotels);
            CityHotelsFragment gh1 = new CityHotelsFragment();
            gh1.setArguments(args);
            return gh1;
        }
        else {
            Bundle args = new Bundle();
            args.putParcelableArrayList("cityMustVisit", mCityMustVisit);
            CityMustVisitFragment gh3 = new CityMustVisitFragment();
            gh3.setArguments(args);
            return gh3;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}