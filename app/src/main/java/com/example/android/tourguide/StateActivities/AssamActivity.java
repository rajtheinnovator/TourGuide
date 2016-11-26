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

                        cityDetail.add(new CityDetails(getResources().getString(R.string.guwahati_name), getResources().getString(R.string.patna_information), R.drawable.bihar_info));

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
                        cityDetail.add(new CityDetails(getResources().getString(R.string.kaziranga_name), getResources().getString(R.string.guwahati_information), R.drawable.bihar_info));
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
                        Intent orangIntent = new Intent(AssamActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.orang_name), getResources().getString(R.string.itanagar_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.orang_hotel1information),
                                getResources().getString(R.string.orang_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.itanagar_reach_by_train),
                                getResources().getString(R.string.orang_reach_by_bus),
                                (getResources().getString(R.string.orang_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.orang_mustVisit_place1Information),
                                getResources().getString(R.string.orang_mustVisit_place2Information),
                                (getResources().getString(R.string.orang_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        orangIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        orangIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        orangIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        orangIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(orangIntent);
                        break;
                    case R.id.jorhat:
                        Intent jorhatIntent = new Intent(AssamActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.jorhat_name),
                                getResources().getString(R.string.jorhat_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.orang_hotel1information),
                                getResources().getString(R.string.jorhat_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.jorhat_reach_by_train),
                                getResources().getString(R.string.jorhat_reach_by_bus),
                                (getResources().getString(R.string.jorhat_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.jorhat_mustVisit_place1Information),
                                getResources().getString(R.string.jorhat_mustVisit_place2Information),
                                (getResources().getString(R.string.jorhat_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        jorhatIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        jorhatIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        jorhatIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        jorhatIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(jorhatIntent);
                        break;
                    case R.id.nameri:
                        Intent nameriIntent = new Intent(AssamActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.nameri_name),
                                getResources().getString(R.string.nameri_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.nameri_hotel1information),
                                getResources().getString(R.string.nameri_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.nameri_reach_by_train),
                                getResources().getString(R.string.nameri_reach_by_bus),
                                (getResources().getString(R.string.jorhat_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.nameri_mustVisit_place1Information),
                                getResources().getString(R.string.nameri_mustVisit_place2Information),
                                (getResources().getString(R.string.nameri_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        nameriIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        nameriIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        nameriIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        nameriIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(nameriIntent);
                        break;
                }
            }
        });
    }
}
