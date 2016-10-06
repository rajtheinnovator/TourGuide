package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class AssamActivity extends AppCompatActivity{
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
        cities.add(new StatesAndCity(getResources().getString(R.string.guwahati_name), R.drawable.assam, R.id.guwahati));
        cities.add(new StatesAndCity(getResources().getString(R.string.kaziranga_name), R.drawable.assam, R.id.kaziranga));
        cities.add(new StatesAndCity(getResources().getString(R.string.orang_name), R.drawable.assam, R.id.orang));
        cities.add(new StatesAndCity(getResources().getString(R.string.jorhat_name), R.drawable.assam, R.id.jorhat));
        cities.add(new StatesAndCity(getResources().getString(R.string.nameri_name), R.drawable.assam, R.id.nameri));

        CityListAdapter stateListAdapter = new CityListAdapter(AssamActivity.this, cities);
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
                    case R.id.guwahati:
                        Intent guwahatiIntent = new Intent(AssamActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        // Create a list of City Details

                        cityDetail.add(new CityDetails(getResources().getString(R.string.patna_information), R.drawable.bihar_info));

                        // Create a list of City Hotels Details

                        cityHotels.add(new CityDetails(getResources().getString(R.string.patna_hotel1information),
                                getResources().getString(R.string.patna_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        // Create a list of City Reach By Details

                        cityReachBy.add(new CityDetails(getResources().getString(R.string.patna_reach_by_train),
                                getResources().getString(R.string.patna_reach_by_bus),
                                (getResources().getString(R.string.patna_reach_by_flight)), R.drawable.bihar_info));

                        // Create a list of CityMust Visit Details

                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.patna_mustVisit_place1Information),
                                getResources().getString(R.string.patna_mustVisit_place2Information),
                                (getResources().getString(R.string.patna_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));

                        guwahatiIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        guwahatiIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        guwahatiIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        guwahatiIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(guwahatiIntent);
                        break;
                    case R.id.kaziranga:
                        guwahatiIntent = new Intent(AssamActivity.this, CityDetailsActivity.class);
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        cityDetail.add(new CityDetails(getResources().getString(R.string.guwahati_information), R.drawable.bihar_info));
                        cityHotels.add(new CityDetails(getResources().getString(R.string.guwahati_hotel1information),
                                getResources().getString(R.string.guwahati_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.gurgaon_reach_by_train),
                                getResources().getString(R.string.guwahati_reach_by_bus),
                                (getResources().getString(R.string.guwahati_reach_by_flight)), R.drawable.bihar_info));
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.guwahati_mustVisit_place1Information),
                                getResources().getString(R.string.guwahati_mustVisit_place2Information),
                                (getResources().getString(R.string.guwahati_mustVisit_place3Information)),
                                R.drawable.bihar_info,  R.drawable.bihar_info,  R.drawable.bihar_info));
                        guwahatiIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        guwahatiIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        guwahatiIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        guwahatiIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);
                        startActivity(guwahatiIntent);
                        break;
                    case R.id.orang:
                        Intent orangIntent = new Intent(AssamActivity.this, OrangCityDetailsActivity.class);
                        startActivity(orangIntent);
                        break;
                    case R.id.jorhat:
                        Intent jorhatIntent = new Intent(AssamActivity.this, JorhatCityDetailsActivity.class);
                        startActivity(jorhatIntent);
                        break;
                    case R.id.nameri:
                        Intent nameriIntent = new Intent(AssamActivity.this, NameriCityDetailsActivity.class);
                        startActivity(nameriIntent);
                        break;
                }
            }
        });
    }
}
