package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.states_list);

        final ArrayList<StatesAndCity> states = new ArrayList<StatesAndCity>();

        states.add(new StatesAndCity(getResources().getString(R.string.arunachal), R.id.arunachal));
        states.add(new StatesAndCity(getResources().getString(R.string.assam), R.id.assam));
        states.add(new StatesAndCity(getResources().getString(R.string.bihar), R.id.bihar));
        states.add(new StatesAndCity(getResources().getString(R.string.chandigarh), R.id.chandigarh));
        states.add(new StatesAndCity(getResources().getString(R.string.delhi), R.id.delhi));
        states.add(new StatesAndCity(getResources().getString(R.string.goa), R.id.goa));
        states.add(new StatesAndCity(getResources().getString(R.string.haryana), R.id.haryana));
        states.add(new StatesAndCity(getResources().getString(R.string.madhya_pradesh), R.id.madhya_pradesh));

        StateListAdapter stateListAdapter = new StateListAdapter(MainActivity.this, states);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.states_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(stateListAdapter);
        //Find the TextView in the MainActivity ans set OnClickListener on them
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                StatesAndCity state = states.get(position);
                switch (state.getmStateOrCityresourceId()) {
                    case R.id.arunachal:
                        Intent arunachalIntent = new Intent(MainActivity.this, ArunachalActivity.class);
                        startActivity(arunachalIntent);
                        break;
                    case R.id.assam:
                        Intent assamIntent = new Intent(MainActivity.this, AssamActivity.class);
                        startActivity(assamIntent);
                        break;
                    case R.id.bihar:
                        Intent biharIntent = new Intent(MainActivity.this, BiharActivity.class);
                        startActivity(biharIntent);
                        break;
                    case R.id.chandigarh:
                        Intent chandigarhIntent = new Intent(MainActivity.this, ChandigarhActivity.class);
                        startActivity(chandigarhIntent);
                        break;
                    case R.id.delhi:
                        Intent delhiIntent = new Intent(MainActivity.this, DelhiActivity.class);
                        startActivity(delhiIntent);
                        break;
                    case R.id.goa:
                        Intent goaIntent = new Intent(MainActivity.this, GoaActivity.class);
                        startActivity(goaIntent);
                        break;
                    case R.id.haryana:
                        Intent haryanaIntent = new Intent(MainActivity.this, HaryanaActivity.class);
                        startActivity(haryanaIntent);
                        break;
                    case R.id.madhya_pradesh:
                        Intent madhya_pradeshIntent = new Intent(MainActivity.this, MadhyaPradeshActivity.class);
                        startActivity(madhya_pradeshIntent);
                        break;
                }
            }
        });
    }
}
