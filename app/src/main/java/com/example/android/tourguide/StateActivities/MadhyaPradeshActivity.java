package com.example.android.tourguide.StateActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.Adapters.CityListAdapter;
import com.example.android.tourguide.Model.CityDetails;
import com.example.android.tourguide.CityDetailsActivity;
import com.example.android.tourguide.R;
import com.example.android.tourguide.Model.StatesAndCity;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class MadhyaPradeshActivity extends AppCompatActivity{
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
        cities.add(new StatesAndCity(getResources().getString(R.string.gwalior_name), R.drawable.madhya_pradesh, R.id.gwalior));
        cities.add(new StatesAndCity(getResources().getString(R.string.indore_name), R.drawable.madhya_pradesh, R.id.indore));
        cities.add(new StatesAndCity(getResources().getString(R.string.bhopal_name), R.drawable.madhya_pradesh, R.id.bhopal));
        cities.add(new StatesAndCity(getResources().getString(R.string.khajuraho_name), R.drawable.madhya_pradesh, R.id.khajuraho));
        cities.add(new StatesAndCity(getResources().getString(R.string.sanchi_name), R.drawable.madhya_pradesh, R.id.sanchi));

        CityListAdapter stateListAdapter = new CityListAdapter(MadhyaPradeshActivity.this, cities);
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
                    case R.id.gwalior:
                        Intent gwaliorIntent = new Intent(MadhyaPradeshActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.gwalior_name),
                                getResources().getString(R.string.gwalior_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.gwalior_hotel1information),
                                getResources().getString(R.string.gwalior_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.gwalior_reach_by_train),
                                getResources().getString(R.string.gwalior_reach_by_bus),
                                (getResources().getString(R.string.gwalior_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.gwalior_mustVisit_place1Information),
                                getResources().getString(R.string.gwalior_mustVisit_place2Information),
                                (getResources().getString(R.string.gwalior_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        gwaliorIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        gwaliorIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        gwaliorIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        gwaliorIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(gwaliorIntent);
                        break;
                    case R.id.indore:
                        Intent indoreIntent = new Intent(MadhyaPradeshActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.indore_name),
                                getResources().getString(R.string.indore_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.indore_hotel1information),
                                getResources().getString(R.string.indore_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.indore_reach_by_train),
                                getResources().getString(R.string.indore_reach_by_bus),
                                (getResources().getString(R.string.indore_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.indore_mustVisit_place1Information),
                                getResources().getString(R.string.indore_mustVisit_place2Information),
                                (getResources().getString(R.string.indore_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        indoreIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        indoreIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        indoreIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        indoreIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(indoreIntent);
                        break;
                    case R.id.bhopal:
                        Intent bhopalIntent = new Intent(MadhyaPradeshActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.bhopal_name),
                                getResources().getString(R.string.bhopal_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.bhopal_hotel1information),
                                getResources().getString(R.string.bhopal_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.bhopal_reach_by_train),
                                getResources().getString(R.string.bhopal_reach_by_bus),
                                (getResources().getString(R.string.bhopal_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.bhopal_mustVisit_place1Information),
                                getResources().getString(R.string.bhopal_mustVisit_place2Information),
                                (getResources().getString(R.string.bhopal_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        bhopalIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        bhopalIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        bhopalIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        bhopalIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(bhopalIntent);
                        break;
                    case R.id.khajuraho:
                        Intent khajurahoIntent = new Intent(MadhyaPradeshActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.khajuraho_name),
                                getResources().getString(R.string.khajuraho_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.khajuraho_hotel1information),
                                getResources().getString(R.string.khajuraho_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.khajuraho_reach_by_train),
                                getResources().getString(R.string.khajuraho_reach_by_bus),
                                (getResources().getString(R.string.khajuraho_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.khajuraho_mustVisit_place1Information),
                                getResources().getString(R.string.khajuraho_mustVisit_place2Information),
                                (getResources().getString(R.string.khajuraho_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        khajurahoIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        khajurahoIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        khajurahoIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        khajurahoIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(khajurahoIntent);
                        break;
                    case R.id.sanchi:
                        Intent sanchiIntent = new Intent(MadhyaPradeshActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.sanchi_name),
                                getResources().getString(R.string.sanchi_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.sanchi_hotel1information),
                                getResources().getString(R.string.sanchi_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.sanchi_reach_by_train),
                                getResources().getString(R.string.sanchi_reach_by_bus),
                                (getResources().getString(R.string.sanchi_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.sanchi_mustVisit_place1Information),
                                getResources().getString(R.string.sanchi_mustVisit_place2Information),
                                (getResources().getString(R.string.sanchi_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        sanchiIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        sanchiIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        sanchiIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        sanchiIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(sanchiIntent);
                        break;
                }
            }
        });
    }
}
