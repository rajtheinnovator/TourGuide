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
public class DelhiActivity extends AppCompatActivity {
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
        cities.add(new StatesAndCity(getResources().getString(R.string.delhi_name), R.drawable.delhi, R.id.delhi));

        CityListAdapter stateListAdapter = new CityListAdapter(DelhiActivity.this, cities);
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
                    case R.id.delhi:
                        Intent delhiIntent = new Intent(DelhiActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.delhi_name),
                                getResources().getString(R.string.delhi_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.delhi_hotel1information),
                                getResources().getString(R.string.delhi_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.delhi_reach_by_train),
                                getResources().getString(R.string.delhi_reach_by_bus),
                                (getResources().getString(R.string.delhi_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.delhi_mustVisit_place1Information),
                                getResources().getString(R.string.delhi_mustVisit_place2Information),
                                (getResources().getString(R.string.delhi_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.bihar_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        delhiIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        delhiIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        delhiIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        delhiIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(delhiIntent);
                        break;
                }
            }
        });
    }
}
