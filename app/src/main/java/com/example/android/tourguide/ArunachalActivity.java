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
public class ArunachalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_list);

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
                        Intent tawangIntent = new Intent(ArunachalActivity.this, TawangCityDetailsActivity.class);
                        startActivity(tawangIntent);
                        break;
                    case R.id.itanagar:
                        Intent itanagarIntent = new Intent(ArunachalActivity.this, ItanagarCityDetailsActivity.class);
                        startActivity(itanagarIntent);
                        break;
                    case R.id.roing:
                        Intent roingIntent = new Intent(ArunachalActivity.this, RoingCityDetailsActivity.class);
                        startActivity(roingIntent);
                        break;
                    case R.id.bondila:
                        Intent bondilaIntent = new Intent(ArunachalActivity.this, BondilaCityDetailsActivity.class);
                        startActivity(bondilaIntent);
                        break;
                    case R.id.ziro:
                        Intent ziroIntent = new Intent(ArunachalActivity.this, ZiroCityDetailsActivity.class);
                        startActivity(ziroIntent);
                        break;

                }
            }
        });
    }
}
