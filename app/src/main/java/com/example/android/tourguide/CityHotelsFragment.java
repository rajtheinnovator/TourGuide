package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class CityHotelsFragment extends Fragment {

    public CityHotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        Bundle bundle = getArguments();

        if ((bundle != null)) {
            ArrayList<CityDetails> cityHotel = getArguments().getParcelableArrayList("cityHotels");

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            CityHotelsAdapter adapter = new CityHotelsAdapter(getActivity(), cityHotel);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.city_list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);
        }

        return rootView;
    }

}
