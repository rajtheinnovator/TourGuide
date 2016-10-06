package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class CityDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a list of City Details
        ArrayList<CityDetails> cityDetail = getIntent().getParcelableArrayListExtra("cityDetail");

        // Create a list of City Hotels Details
        ArrayList<CityDetails> cityHotels = getIntent().getParcelableArrayListExtra("cityHotels");

        // Create a list of City Reach By Details
        ArrayList<CityDetails> cityReachBy = getIntent().getParcelableArrayListExtra("cityReachBy");

         // Create a list of CityMust Visit Details
        ArrayList<CityDetails> cityMustVisit = getIntent().getParcelableArrayListExtra("cityMustVisit");

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
        //setting the title on the app bar with the name of the respective city
        this.setTitle(cityDetail.get(0).getCityname());
    }
}