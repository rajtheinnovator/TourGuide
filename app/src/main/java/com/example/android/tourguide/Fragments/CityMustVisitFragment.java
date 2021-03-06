package com.example.android.tourguide.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.Adapters.CityMustVisitAdapter;
import com.example.android.tourguide.Model.CityDetails;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class CityMustVisitFragment extends Fragment {

    public CityMustVisitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        Bundle bundle = getArguments();

        if ((bundle != null)) {
            ArrayList<CityDetails> cityMustVisit = getArguments().getParcelableArrayList("cityMustVisit");

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            CityMustVisitAdapter cityMustVisitAdapter = new CityMustVisitAdapter(getActivity(), cityMustVisit);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.city_list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(cityMustVisitAdapter);
        }

        return rootView;
    }

}
