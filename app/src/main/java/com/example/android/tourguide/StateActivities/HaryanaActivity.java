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
public class HaryanaActivity extends AppCompatActivity{
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
        cities.add(new StatesAndCity(getResources().getString(R.string.gurgaon_name), R.drawable.haryana, R.id.gurgaon));
        cities.add(new StatesAndCity(getResources().getString(R.string.karnal_name), R.drawable.haryana, R.id.karnal));
        cities.add(new StatesAndCity(getResources().getString(R.string.kurukshetra_name), R.drawable.haryana, R.id.kurukshetra));
        cities.add(new StatesAndCity(getResources().getString(R.string.panipat_name), R.drawable.haryana, R.id.panipat));
        cities.add(new StatesAndCity(getResources().getString(R.string.hisar_name), R.drawable.haryana, R.id.hisar));

        CityListAdapter stateListAdapter = new CityListAdapter(HaryanaActivity.this, cities);
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
                    case R.id.gurgaon:
                        Intent gurgaonIntent = new Intent(HaryanaActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.gurgaon_name),
                                getResources().getString(R.string.gurgaon_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.gurgaon_hotel1information),
                                getResources().getString(R.string.gurgaon_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.gurgaon_reach_by_train),
                                getResources().getString(R.string.gurgaon_reach_by_bus),
                                (getResources().getString(R.string.gurgaon_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.gurgaon_mustVisit_place1Information),
                                getResources().getString(R.string.gurgaon_mustVisit_place2Information),
                                (getResources().getString(R.string.gurgaon_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        gurgaonIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        gurgaonIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        gurgaonIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        gurgaonIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(gurgaonIntent);
                        break;
                    case R.id.karnal:
                        Intent karnalIntent = new Intent(HaryanaActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.karnal_name),
                                getResources().getString(R.string.karnal_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.karnal_hotel1information),
                                getResources().getString(R.string.karnal_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.karnal_reach_by_train),
                                getResources().getString(R.string.karnal_reach_by_bus),
                                (getResources().getString(R.string.karnal_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.karnal_mustVisit_place1Information),
                                getResources().getString(R.string.karnal_mustVisit_place2Information),
                                (getResources().getString(R.string.karnal_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        karnalIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        karnalIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        karnalIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        karnalIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(karnalIntent);
                        break;
                    case R.id.kurukshetra:
                        Intent kurukshetraIntent = new Intent(HaryanaActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.kurukshetra_name),
                                getResources().getString(R.string.kurukshetra_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.kurukshetra_hotel1information),
                                getResources().getString(R.string.kurukshetra_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.kurukshetra_reach_by_train),
                                getResources().getString(R.string.kurukshetra_reach_by_bus),
                                (getResources().getString(R.string.kurukshetra_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.kurukshetra_mustVisit_place1Information),
                                getResources().getString(R.string.kurukshetra_mustVisit_place2Information),
                                (getResources().getString(R.string.kurukshetra_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        kurukshetraIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        kurukshetraIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        kurukshetraIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        kurukshetraIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(kurukshetraIntent);
                        break;
                    case R.id.panipat:
                        Intent panipatIntent = new Intent(HaryanaActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.hisar_name),
                                getResources().getString(R.string.panipat_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.panipat_hotel1information),
                                getResources().getString(R.string.panipat_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.panipat_reach_by_train),
                                getResources().getString(R.string.panipat_reach_by_bus),
                                (getResources().getString(R.string.panipat_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.panipat_mustVisit_place1Information),
                                getResources().getString(R.string.panipat_mustVisit_place2Information),
                                (getResources().getString(R.string.panipat_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        panipatIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        panipatIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        panipatIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        panipatIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(panipatIntent);
                        break;
                    case R.id.hisar:
                        Intent hisarIntent = new Intent(HaryanaActivity.this, CityDetailsActivity.class);

                        //Clear all the details contained in the array lists for storing fresh values for this city intent
                        cityDetail.clear();
                        cityHotels.clear();
                        cityReachBy.clear();
                        cityMustVisit.clear();

                        //Add all the details about the city related to city, hotels, commute, and places to visit
                        //City details information here
                        cityDetail.add(new CityDetails(getResources().getString(R.string.hisar_name),
                                getResources().getString(R.string.goa_information), R.drawable.bihar_info));

                        //City hotels information here
                        cityHotels.add(new CityDetails(getResources().getString(R.string.hisar_hotel1information),
                                getResources().getString(R.string.hisar_hotel2information), R.drawable.bihar_info, R.drawable.bihar_info));

                        //City how to reach there/commute information here
                        cityReachBy.add(new CityDetails(getResources().getString(R.string.hisar_reach_by_train),
                                getResources().getString(R.string.hisar_reach_by_bus),
                                (getResources().getString(R.string.hisar_reach_by_flight)), R.drawable.bihar_info));

                        //City places to visit information here
                        cityMustVisit.add(new CityDetails(getResources().getString(R.string.hisar_mustVisit_place1Information),
                                getResources().getString(R.string.hisar_mustVisit_place2Information),
                                (getResources().getString(R.string.hisar_mustVisit_place3Information)),
                                R.drawable.bihar_info, R.drawable.goa_info, R.drawable.bihar_info));

                        //Put all the city information array lists inside the intent using parcelable class
                        hisarIntent.putParcelableArrayListExtra("cityDetail", cityDetail);
                        hisarIntent.putParcelableArrayListExtra("cityHotels", cityHotels);
                        hisarIntent.putParcelableArrayListExtra("cityReachBy", cityReachBy);
                        hisarIntent.putParcelableArrayListExtra("cityMustVisit", cityMustVisit);

                        //start the city intent when it's been clicked
                        startActivity(hisarIntent);
                        break;
                }
            }
        });
    }
}
