package com.example.android.tourguide.StateActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.Model.CityDetails;
import com.example.android.tourguide.CityDetailsActivity;
import com.example.android.tourguide.Adapters.CityListAdapter;
import com.example.android.tourguide.R;
import com.example.android.tourguide.Model.StatesAndCity;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class BiharActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_list);
        final ArrayList<CityDetails> cityDetail = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityHotels = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityReachBy = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityMustVisit = new ArrayList<CityDetails>();

        final ArrayList<StatesAndCity> cities = new ArrayList<StatesAndCity>();
        //Currently images are just place holder one, I'll change that later on.
        cities.add(new StatesAndCity(getResources().getString(R.string.patna_name), R.drawable.bihar, R.id.patna));
        cities.add(new StatesAndCity(getResources().getString(R.string.bhagalpur_name), R.drawable.bihar, R.id.bhagalpur));
        cities.add(new StatesAndCity(getResources().getString(R.string.bodhgaya_name), R.drawable.bihar, R.id.bodhgaya));
        cities.add(new StatesAndCity(getResources().getString(R.string.nalanda_name), R.drawable.bihar, R.id.nalanda));
        cities.add(new StatesAndCity(getResources().getString(R.string.sonepur_name), R.drawable.bihar, R.id.sonepur));
        cities.add(new StatesAndCity(getResources().getString(R.string.darbhanga_name), R.drawable.bihar, R.id.darbhanga));


        CityListAdapter stateListAdapter = new CityListAdapter(BiharActivity.this, cities);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.city_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(stateListAdapter);
        //Find the TextView in the MainActivity ans set OnClickListener on them
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                StatesAndCity state = cities.get(position);
                switch (state.getmStateOrCityresourceId()) {
                    case R.id.patna:
                        Intent patnaIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.patna_name), getResources().getString(R.string.panipat_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.patna_hotel1information),
                                getResources().getString(R.string.patna_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.patna_reach_by_train),
                                getResources().getString(R.string.patna_reach_by_bus),
                                (getResources().getString(R.string.patna_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.patna_mustVisit_place1Information),
                                getResources().getString(R.string.patna_mustVisit_place2Information),
                                (getResources().getString(R.string.patna_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        patnaIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        patnaIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        patnaIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        patnaIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(patnaIntent);
                        break;
                    case R.id.bhagalpur:
                        Intent bhagalpurIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.bhagalpur_name), getResources().getString(R.string.bhagalpur_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.bhagalpur_hotel1information),
                                getResources().getString(R.string.bhagalpur_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.gurgaon_reach_by_train),
                                getResources().getString(R.string.bhagalpur_reach_by_bus),
                                (getResources().getString(R.string.bhagalpur_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.bhagalpur_mustVisit_place1Information),
                                getResources().getString(R.string.bhagalpur_mustVisit_place2Information),
                                (getResources().getString(R.string.bhagalpur_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        bhagalpurIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        bhagalpurIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        bhagalpurIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        bhagalpurIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(bhagalpurIntent);
                        break;
                    case R.id.bodhgaya:
                        Intent bodhgayaIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.bodhgaya_name), getResources().getString(R.string.bodhgaya_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.bodhgaya_hotel1information),
                                getResources().getString(R.string.bodhgaya_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.bodhgaya_reach_by_train),
                                getResources().getString(R.string.bodhgaya_reach_by_bus),
                                (getResources().getString(R.string.bodhgaya_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.bodhgaya_mustVisit_place1Information),
                                getResources().getString(R.string.bodhgaya_mustVisit_place2Information),
                                (getResources().getString(R.string.bodhgaya_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        bodhgayaIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        bodhgayaIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        bodhgayaIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        bodhgayaIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(bodhgayaIntent);
                        break;
                    case R.id.nalanda:
                        Intent nalandaIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.nalanda_name), getResources().getString(R.string.nalanda_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.nalanda_hotel1information),
                                getResources().getString(R.string.nalanda_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.nalanda_reach_by_train),
                                getResources().getString(R.string.nalanda_reach_by_bus),
                                (getResources().getString(R.string.nalanda_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.nalanda_mustVisit_place1Information),
                                getResources().getString(R.string.nalanda_mustVisit_place2Information),
                                (getResources().getString(R.string.nalanda_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        nalandaIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        nalandaIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        nalandaIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        nalandaIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(nalandaIntent);
                        break;
                    case R.id.sonepur:
                        Intent sonepurIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.sonepur_name), getResources().getString(R.string.sonepur_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.sonepur_hotel1information),
                                getResources().getString(R.string.sonepur_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.sonepur_reach_by_train),
                                getResources().getString(R.string.sonepur_reach_by_bus),
                                (getResources().getString(R.string.sonepur_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.sonepur_mustVisit_place1Information),
                                getResources().getString(R.string.sonepur_mustVisit_place2Information),
                                (getResources().getString(R.string.sonepur_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        sonepurIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        sonepurIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        sonepurIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        sonepurIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(sonepurIntent);
                        break;
                    case R.id.darbhanga:
                        Intent darbhangaIntent = new Intent(BiharActivity.this, CityDetailsActivity.class);
                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        cityDetail.add(new CityDetails(getResources().getString(R.string.darbhanga_name), getResources().getString(R.string.darbhanga_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.darbhanga_hotel1information),
                                getResources().getString(R.string.darbhanga_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.darbhanga_reach_by_train),
                                getResources().getString(R.string.darbhanga_reach_by_bus),
                                (getResources().getString(R.string.darbhanga_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.darbhanga_mustVisit_place1Information),
                                getResources().getString(R.string.darbhanga_mustVisit_place2Information),
                                (getResources().getString(R.string.darbhanga_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        //Put all the city information array lists inside the intent using parcelable class
                        darbhangaIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        darbhangaIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        darbhangaIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        darbhangaIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        //start the city intent when it's been clicked
                        startActivity(darbhangaIntent);
                        break;
                }
            }
        });
    }
}
