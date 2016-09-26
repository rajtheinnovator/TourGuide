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
public class MadhyaPradeshActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_list);

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
                        Intent gwaliorIntent = new Intent(MadhyaPradeshActivity.this, GwaliorCityDetailsActivity.class);
                        startActivity(gwaliorIntent);
                        break;
                    case R.id.indore:
                        Intent indoreIntent = new Intent(MadhyaPradeshActivity.this, IndoreCityDetailsActivity.class);
                        startActivity(indoreIntent);
                        break;
                    case R.id.bhopal:
                        Intent bhopalIntent = new Intent(MadhyaPradeshActivity.this, BhopalCityDetailsActivity.class);
                        startActivity(bhopalIntent);
                        break;
                    case R.id.khajuraho:
                        Intent khajurahoIntent = new Intent(MadhyaPradeshActivity.this, KhajurahoCityDetailsActivity.class);
                        startActivity(khajurahoIntent);
                        break;
                    case R.id.sanchi:
                        Intent sanchiIntent = new Intent(MadhyaPradeshActivity.this, SanchiCityDetailsActivity.class);
                        startActivity(sanchiIntent);
                        break;
                }
            }
        });
    }
}
