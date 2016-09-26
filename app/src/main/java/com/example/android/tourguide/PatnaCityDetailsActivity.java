package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class PatnaCityDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a list of City Details
        ArrayList<CityDetails> cityDetail = new ArrayList<CityDetails>();
        cityDetail.add(new CityDetails(getResources().getString(R.string.patna_information), R.drawable.bihar_info));

        // Create a list of City Hotels Details
        ArrayList<CityDetails> cityHotels = new ArrayList<CityDetails>();
        cityHotels.add(new CityDetails(getResources().getString(R.string.patna_hotel1information),
                getResources().getString(R.string.patna_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

        // Create a list of City Reach By Details
        ArrayList<CityDetails> cityReachBy = new ArrayList<CityDetails>();
        cityReachBy.add(new CityDetails(getResources().getString(R.string.patna_reach_by_train),
                getResources().getString(R.string.patna_reach_by_bus),
                (getResources().getString(R.string.patna_reach_by_flight)), R.drawable.bihar_info));

        // Create a list of CityMust Visit Details
        ArrayList<CityDetails> cityMustVisit = new ArrayList<CityDetails>();
        cityMustVisit.add(new CityDetails(getResources().getString(R.string.patna_mustVisit_place1Information),
                getResources().getString(R.string.patna_mustVisit_place2Information),
                (getResources().getString(R.string.patna_mustVisit_place3Information)),
                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));

        //Creating a bundle to hold all the above data
        Bundle cityDetails = new Bundle();
        cityDetails.putParcelableArrayList("cityDetails", cityDetail);
        cityDetails.putParcelableArrayList("cityHotels", cityHotels);
        cityDetails.putParcelableArrayList("cityReachBy", cityReachBy);
        cityDetails.putParcelableArrayList("cityMustVisit", cityMustVisit);

        //Creating Fragments where we could show what we want
        CityInformationFragment cityInformationFragment = new CityInformationFragment();
        CityHotelsFragment cityHotelsFragment = new CityHotelsFragment();
        CityReachByFragment cityReachByFragment = new CityReachByFragment();
        CityMustVisitFragment cityMustVisitFragment = new CityMustVisitFragment();

        //Setting fragments with actual Data
        cityHotelsFragment.setArguments(cityDetails);
        cityInformationFragment.setArguments(cityDetails);
        cityReachByFragment.setArguments(cityDetails);
        cityMustVisitFragment.setArguments(cityDetails);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.fragment_main);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        FragmentPagerAdapter adapterViewPager;
        adapterViewPager = new CityDetailsPagerAdapter(getSupportFragmentManager(), cityDetail,
                cityHotels, cityReachBy, cityMustVisit);
        vpPager.setAdapter(adapterViewPager);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(vpPager);
    }
}

