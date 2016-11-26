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
public class ArunachalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_list);
        //Create array lists for storing information related to city details, hotels, commute, and places to visit
        final ArrayList<CityDetails> cityDetail = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityHotels = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityReachBy = new ArrayList<CityDetails>();
        final ArrayList<CityDetails> cityMustVisit = new ArrayList<CityDetails>();

        final ArrayList<StatesAndCity> cities = new ArrayList<StatesAndCity>();
        //Currently images are just place holder one, I'll change that later on.
        cities.add(new StatesAndCity(getResources().getString(R.string.tawang_name), R.drawable.arunachal, R.id.tawang));
        cities.add(new StatesAndCity(getResources().getString(R.string.itanagar_name), R.drawable.arunachal, R.id.itanagar));
        cities.add(new StatesAndCity(getResources().getString(R.string.roing_name), R.drawable.arunachal, R.id.roing));
        cities.add(new StatesAndCity(getResources().getString(R.string.bondila_name), R.drawable.arunachal, R.id.bondila));
        cities.add(new StatesAndCity(getResources().getString(R.string.ziro_name), R.drawable.arunachal, R.id.ziro));


        CityListAdapter stateListAdapter = new CityListAdapter(ArunachalActivity.this, cities);
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
                    case R.id.tawang:
                        Intent tawangIntent = new Intent(ArunachalActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.tawang_name),
                                getResources().getString(R.string.tawang_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.tawang_hotel1information),
                                getResources().getString(R.string.tawang_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.tawang_reach_by_train),
                                getResources().getString(R.string.tawang_reach_by_bus),
                                (getResources().getString(R.string.tawang_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.tawang_mustVisit_place1Information),
                                getResources().getString(R.string.tawang_mustVisit_place2Information),
                                (getResources().getString(R.string.tawang_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        tawangIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        tawangIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        tawangIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        tawangIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(tawangIntent);
                        break;
                    case R.id.itanagar:
                        Intent itanagarIntent = new Intent(ArunachalActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.itanagar_name), getResources().getString(R.string.itanagar_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.itanagar_hotel1information),
                                getResources().getString(R.string.itanagar_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.itanagar_reach_by_train),
                                getResources().getString(R.string.itanagar_reach_by_bus),
                                (getResources().getString(R.string.itanagar_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.itanagar_mustVisit_place1Information),
                                getResources().getString(R.string.itanagar_mustVisit_place2Information),
                                (getResources().getString(R.string.itanagar_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        itanagarIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        itanagarIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        itanagarIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        itanagarIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(itanagarIntent);
                        break;
                    case R.id.roing:
                        Intent roingIntent = new Intent(ArunachalActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.roing_name), getResources().getString(R.string.roing_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.roing_hotel1information),
                                getResources().getString(R.string.roing_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.roing_reach_by_train),
                                getResources().getString(R.string.roing_reach_by_bus),
                                (getResources().getString(R.string.roing_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.bondila_mustVisit_place1Information),
                                getResources().getString(R.string.roing_mustVisit_place2Information),
                                (getResources().getString(R.string.roing_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        roingIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        roingIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        roingIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        roingIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(roingIntent);
                        break;
                    case R.id.bondila:
                        Intent bondilaIntent = new Intent(ArunachalActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();
                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.bondila_name), getResources().getString(R.string.bondila_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.bondila_hotel1information),
                                getResources().getString(R.string.bondila_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.bondila_reach_by_train),
                                getResources().getString(R.string.bondila_reach_by_bus),
                                (getResources().getString(R.string.bondila_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.bondila_mustVisit_place1Information),
                                getResources().getString(R.string.bondila_mustVisit_place2Information),
                                (getResources().getString(R.string.bondila_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        bondilaIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        bondilaIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        bondilaIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        bondilaIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(bondilaIntent);
                        break;
                    case R.id.ziro:
                        Intent ziroIntent = new Intent(ArunachalActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.ziro_name), getResources().getString(R.string.ziro_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.ziro_hotel1information),
                                getResources().getString(R.string.ziro_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.ziro_reach_by_train),
                                getResources().getString(R.string.ziro_reach_by_bus),
                                (getResources().getString(R.string.ziro_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.ziro_mustVisit_place1Information),
                                getResources().getString(R.string.ziro_mustVisit_place2Information),
                                (getResources().getString(R.string.ziro_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        ziroIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        ziroIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        ziroIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        ziroIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(ziroIntent);
                        break;
                }
            }
        });
    }
}
